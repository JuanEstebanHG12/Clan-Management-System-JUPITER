package com.jupiter.src.repository; // Verifica que este sea tu package real

public class TestImporter {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   INICIANDO TEST DE REPOSITORIO       ");
        System.out.println("========================================\n");

        try {
            //instanciamos el constructor
            AdminRepository repo = new AdminRepository();


            repo.getAllUsers();

            System.out.println("\n========================================");
            System.out.println("   TEST FINALIZADO CON ÉXITO           ");
            System.out.println("========================================");

        } catch (Exception e) {
            System.out.println("\n[ERROR EN EL TEST]:");
            e.printStackTrace();
            // Si sale un error aquí, lee la consola,
            // probablemente dirá "File Not Found" si la ruta del CSV está mal.
        }
    }
}