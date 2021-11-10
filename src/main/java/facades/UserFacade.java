package facades;

import dtos.RoleDTO;
import entities.Role;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;

import security.errorhandling.AuthenticationException;

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

    public RoleDTO getRoleByUsername(String username) throws WebApplicationException {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Role> query = em.createQuery("SELECT u FROM User u join u.roleList WHERE u.userName =:user_name", Role.class);
            query.setParameter("user_name", username);
            Role role = query.getSingleResult();
            return new RoleDTO(role);

        } finally {
            em.close();
        }
    }

}
