package com.jupiter.src.repository;

import java.util.List;
import com.jupiter.src.persistance.Handler;

public class AdminRepository {

    private Handler handler;

    public AdminRepository() {
        handler = new Handler("./data");
    }

    public void getAllUsers() {
        List<String[]> users = handler.read("info.csv");

        for (String[] user : users) {
            System.out.println("Nombre: " + user[0] + " Email: " + user[1] + " Rol: " + user[2]);
        }
    }

    }