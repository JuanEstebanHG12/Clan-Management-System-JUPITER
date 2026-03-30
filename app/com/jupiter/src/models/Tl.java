package models;

import models.enums.Clan;
import  models.enums.Role;
import  models.User;
//Place where you create the class of Tl.
public  class Tl extends User{
    private Clan clan;
    public Tl(String username, String password, Role role, Clan clan){
       super(username,password,role);
       this.clan = clan;
    }

    @Override
    public String toString() {
        return "id->[" + getId() + "] " + getUsername() + " (" + getRole() + ") "+ clan;
    }
}
