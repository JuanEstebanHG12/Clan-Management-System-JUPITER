package com.management.jupiter.controllers;

import com.management.jupiter.models.User;
import com.management.jupiter.services.UserServices;

import java.util.Scanner;

public class UserController {
    public static void LoginController() throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("=== SISTEMA DE LOGIN JUPITER ===");


        // 2. DELEGAR AL SERVICE (No al Repository directamente)
        User loggedUser = null;

        for (var i = 0; i<3; i++){
            try {
                // 1. CAPTURAR DATOS
                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();
                loggedUser = UserServices.LoginService(email, password);
                if (loggedUser != null) {
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        // 3. DECIDIR QUÉ MOSTRAR
        if (loggedUser != null) {
            System.out.println("\n Access Successfully." + loggedUser);
        } else {
            System.out.println("\n Error: Access Deny.");
        }
    }
}