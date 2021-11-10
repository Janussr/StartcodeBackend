package dtos;

import dtos.Role.RoleDTO;
import entities.User;

import java.util.List;

public class UserDTO {
    private String userName;
    private String userPass;
    private List<RoleDTO> roles;

    public UserDTO(User user) {
        this.userName = user.getUserName();
        this.userPass = user.getUserPass();
        this.roles = RoleDTO.getFromList(user.getRoleList());
    }

    public UserDTO(String userName, String userPass, List<RoleDTO> roles) {
        this.userName = userName;
        this.userPass = userPass;
        this.roles = roles;
    }

    public UserDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}
