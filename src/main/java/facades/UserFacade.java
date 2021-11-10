package facades;

import dtos.Role.RoleDTO;
import dtos.Role.RolesDTO;
import entities.Role;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;

import security.errorhandling.AuthenticationException;

import java.util.List;

public class UserFacade {

    private static EntityManagerFactory emf;
    private static UserFacade instance;

    private UserFacade() {
    }

    public static UserFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new UserFacade();
        }
        return instance;
    }

    public User getVerifiedUser(String username, String password) throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        User user;
        try {
            user = em.find(User.class, username);
            if (user == null || !user.verifyPassword(password)) {
                throw new AuthenticationException("Invalid user name or password");
            }
        } finally {
            em.close();
        }
        return user;
    }

    public RolesDTO getRolesByUsername(String username) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Role> query = em.createQuery("SELECT r from Role r JOIN r.userList u WHERE u.userName =:user_name ", Role.class);
            query.setParameter("user_name", username);
            List<Role> roles = query.getResultList();

            return new RolesDTO(roles);

        } finally {
            em.close();
        }
    }

}
