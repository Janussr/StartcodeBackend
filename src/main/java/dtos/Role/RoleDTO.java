package dtos.Role;

import entities.Role;

import java.util.List;
import java.util.stream.Collectors;

public class RoleDTO {
    private String roleName;

    public static List<RoleDTO> getFromList(List<Role> roles) {
        return roles.stream()
                .map(role -> new RoleDTO(role))
                .collect(Collectors.toList());
    }

    public RoleDTO(Role role) {
        this.roleName = role.getRoleName();
    }

    public RoleDTO(String roleName) {
        this.roleName = roleName;
    }

    public RoleDTO() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
