package dtos.Role;

import entities.Role;

import java.util.List;

public class RolesDTO {
    private List<RoleDTO> roles;

    public RolesDTO(List<Role> roles) {
        this.roles = RoleDTO.getFromList(roles);
    }

    public RolesDTO() {
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}
