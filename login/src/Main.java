import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the username :");
        String usernameInput = sc.nextLine();
        System.out.println("Please enter the password :");
        String passwordInput = sc.nextLine();
        int c = 0 ;
        BufferedReader br = new BufferedReader(new FileReader("info.txt"));
        String username1 = br.readLine();
        String password1 = br.readLine();
        while(password1!=null){
            if(username1.equals(usernameInput)){
                if(password1.equals(passwordInput)){
                    System.out.println("hello welcome");
                    c++;
                    break;
                }
            }
            if(c==0){
                username1=br.readLine();
                password1=br.readLine();
            }
        }
        if(c==0){
            System.out.println("user not found");
        }
        br.close();
    }
}

