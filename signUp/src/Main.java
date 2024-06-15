import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter bw = new FileWriter("info.txt",true);
        String name ;
        String family ;
        String username ;
        String email ;
        String phoneNumber ;
        String password ;
        String confirmPassword ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        bw.write(name+"\n");
        System.out.println("Enter your family: ");
        family = sc.nextLine();
        bw.write(family+"\n");
        System.out.println("Enter your username: ");
        username = sc.nextLine();
        bw.write(username+"\n");
        System.out.println("Enter your email: ");
        email = sc.nextLine();
        bw.write(email+"\n");
        System.out.println("Enter your phone number: ");
        phoneNumber = sc.nextLine();
        bw.write(phoneNumber+"\n");
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter your password: ");
            password = sc.nextLine();
            System.out.println("Enter your confirm password: ");
            confirmPassword = sc.nextLine();
            if(password.equals(confirmPassword)) {
                bw.write(password+"\n");
                System.out.println("password match.");
                break;
            }
            else{
                System.out.println("Passwords do not match . enter again :");

            }
        }
        bw.close();
    }
}