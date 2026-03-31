package com.jupiter.src;

import com.jupiter.src.repository.AdminRepository;

public class Main {
    public static void main(String[] args) {

        AdminRepository adminRepo = new AdminRepository();


        System.out.println("--- Probando importación de CSV ---");
        adminRepo.getAllUsers();
    }
}