package models;


import models.enums.Clan;
import models.enums.Role;

public class Coder extends User {
    private final Clan clan;

    public Coder(String username, String password, Role role, Clan clan) {
        super(username, password, role);
        this.clan = clan;
    }

    @Override
    public String toString() {
        return "id->[" + getId() + "] " + getUsername() + " (" + getRole() + ") " + clan;
    }
}
