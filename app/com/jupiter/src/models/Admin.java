package models;

import models.User;
import models.enums.Role;

//Place where you create the class of Admin.
public class Admin extends User {
    public Admin(String username, String password, Role role){
        super(username, password, role);
    }
}