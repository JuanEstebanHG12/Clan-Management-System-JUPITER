package repository;

public class TestImporter {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   INICIANDO TEST DE REPOSITORIO       ");
        System.out.println("========================================\n");

        try {
            // Instanciamos repositorio
            AdminRepository repo = new AdminRepository();

            // CREATE (datos quemados)
            System.out.println("Insertando usuario de prueba...\n");

            repo.insertUser(
                    "Carlos Perez",
                    "carlos@test.com",
                    "123456",
                    "ADMIN"
            );

            // 🔍 READ para validar
            System.out.println("Usuarios actuales:\n");
            repo.getAllUsers();

            System.out.println("\n========================================");
            System.out.println("   TEST FINALIZADO CON ÉXITO           ");
            System.out.println("========================================");

        } catch (Exception e) {
            System.out.println("\n[ERROR EN EL TEST]:");
            e.printStackTrace();
        }
    }
}