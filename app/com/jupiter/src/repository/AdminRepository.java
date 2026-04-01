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
    public void deleteUser(String email){
        //Leemos todos los usuarios.
        List<String[]> users = handler.read("info.csv");

        //Filtramos los que no coincidan con el email para eliminar
        boolean removed = users.removeIf(user -> user[1].equalsIgnoreCase(email));
        if (removed){
            //Reescribo el CSV sin el usuario eliminado.
            handler.write("info.csv", users);
            System.out.println("El usuario eliminado fue: " + email);
        }else {
            System.out.println("Ese usuario no existe");
        }
    }
}
