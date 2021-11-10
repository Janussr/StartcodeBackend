package facades;

import dtos.RoleDTO;

import javax.persistence.EntityManagerFactory;

public class RoleFacade {
    private static EntityManagerFactory emf;
    private static RoleFacade instance;

    private RoleFacade() {
    }

    public static RoleFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new RoleFacade();
        }
        return instance;
    }

    public RoleDTO getRoleByUsername(RoleDTO roleDTO) {

        return null;
    }

}
