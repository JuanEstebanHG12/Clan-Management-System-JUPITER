//Place where you create the class of User.
package models;

import enums.Role;

//Place where you create the class of User.
public class User {
    private static int counter = 1;

    private int id;
    private String username;
    private String password;
    private Role role;

    public User(String username, String password, Role role) {
        this.id = counter++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getId()           { return id; }
    public String getUsername()  { return username; }
    public String getPassword()  { return password; }
    public Role getRole()        { return role; }

    @Override
    public String toString() {
        return "id->[" + id + "] " + username + " (" + role + ")";
    }
}
