import java.util.Scanner;

public class LoginView {

    private Scanner scanner;

    public LoginView(){
        scanner = new Scanner(System.in);
    }

    public String viewLogin(){

    int option = 1;

        do{

            System.out.println("========= LOGIN ==========");

            System.out.println("Email: ");
            String email = scanner.nextLine();

            System.out.println("Password: ");
            String password = scanner.nextLine();

            if(email.equals("coder@gmail.com") && password.equals("123456")){
                System.out.println("Login success!");
                return "coder";
            }
            else if(email.equals("tl@gmail.com") && password.equals("123456")){
                System.out.println("Login success!");
                return "tl";
            }else if(email.equals("admin@gmail.com") && password.equals("123456")){
                System.out.println("Login success!");
                return "admin";
            }else{

                boolean again = true;

                while(again){

                    System.out.println("email or password incorrect ... ");

                    System.out.println("1. Try again");
                    System.out.println("0. Exit");

                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option){
                        case 1:
                            again = false;
                            break;

                        case 0:
                            System.out.println("Exit ...");
                            again = false;
                            option = 0;
                            break;
                        default:
                            System.out.println("Incorrect option ...");
                    }
                }


            }

        }while(option != 0);

        return "exit";
    }

    public void closeScanner(){
        scanner.close();
    }

}
