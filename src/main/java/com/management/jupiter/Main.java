package com.management.jupiter;

import views.LoginView;
import views.CoderView;
import views.TLView;
import views.AdminView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();

        String loginSuccess = loginView.viewLogin();

        if(loginSuccess.equals("coder")){
            CoderView coderView = new CoderView();
            coderView.menuCoder();
            coderView.close();
        }else if(loginSuccess.equals("tl")){
            TLView tlView = new TLView();
            tlView.menuTL();
            tlView.close();
        }else if(loginSuccess.equals("admin")){
            AdminView adminView = new AdminView();
            adminView.menuAdmin();
            adminView.close();
        }

        loginView.closeScanner();

    }
}