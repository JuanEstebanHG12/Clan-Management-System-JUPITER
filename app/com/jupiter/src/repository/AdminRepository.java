package repository;

import persistance.Handler;

import java.util.List;


public class AdminRepository {

    private Handler handler;

    public AdminRepository() {
        handler = new Handler("./app/com/jupiter/src/persistance");
    }

    public void getAllUsers() {
        List<String[]> users = handler.read("info.csv");

        for (String[] user : users) {
            System.out.println("Name: " + user[0] + " Email: " + user[1] + " Rol: " + user[2]);
        }
    }
    public void insertUser(String name, String email, String password, String role){
        //Creo el array que los va a contener.
        List<String[]> users = handler.read("info.csv");

        //lo construyo
        String[] newUser = new String[]{name, email, password, role};

        //Crear nuevo usuario - fila
        users.add(new String[]{name, email, password, role});

        //Lo añadimos al archivo para la persistencia
        handler.write("info.csv", users);
    }

    }