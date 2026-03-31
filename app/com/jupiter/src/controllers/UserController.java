package controllers;

import models.User;
import services.UserServices;

import java.util.Scanner;

public class UserController {
    public static void LoginController(){
        var scanner = new Scanner(System.in);
        System.out.println("=== SISTEMA DE LOGIN JUPITER ===");
        // 1. CAPTURAR DATOS
        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // 2. DELEGAR AL SERVICE (No al Repository directamente)
        User loggedUser = UserServices.LoginService(email, password);

        // 3. DECIDIR QUÉ MOSTRAR
        if (loggedUser != null) {
            System.out.println("\n Access Successfully." + loggedUser);
        } else {
            System.out.println("\n Error: Access Deny.");
        }
    }
}