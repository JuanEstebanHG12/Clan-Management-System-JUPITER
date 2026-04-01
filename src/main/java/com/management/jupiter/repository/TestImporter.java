package com.management.jupiter.repository;

public class TestImporter {

    public static void main(String[] args) {

        AdminRepository repo = new AdminRepository();

        System.out.println("========================================");
        System.out.println("   INICIANDO TEST DE REPOSITORIO       ");
        System.out.println("========================================\n");

        // 🔥 1. Quemar datos (vaciar archivo)
        System.out.println("Limpiando archivo...");
        repo.insertUser("RESET", "reset@system.com", "000", "   temp");
        repo.deleteUser("reset@system.com");

        // 👤 2. Insertar usuarios
        System.out.println("\nInsertando usuarios...");

        repo.insertUser("Juan Admin", "admin@test.com", "1234", "admin");
        repo.insertUser("Pedro Coder", "coder@test.com", "5678", "coder");

        // 📋 3. Mostrar usuarios
        System.out.println("\nUsuarios actuales:");
        repo.getAllUsers();

        // ❌ 4. Eliminar uno
        System.out.println("\nEliminando usuario coder...");
        repo.deleteUser("coder@test.com");

        // 📋 5. Mostrar resultado final
        System.out.println("\nUsuarios después de eliminar:");
        repo.getAllUsers();

        System.out.println("\n========================================");
        System.out.println("   TEST FINALIZADO CON ÉXITO           ");
        System.out.println("========================================");
    }
}