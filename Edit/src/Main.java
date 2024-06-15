import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("info.txt"));
        ArrayList<String> info = new ArrayList<String>();
        String line;
        line = br.readLine();
        while(line != null) {
            info.add(line);
            line = br.readLine();
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
        bw.close();
        boolean find = true ;
        System.out.println("Please enter the old password : ");
        String oldPassword = sc.nextLine();
        System.out.println("please enter the new password : ");
        String newPassword = sc.nextLine();
        FileWriter fw = new FileWriter("info.txt",true);
        for(String info1 : info) {
            if(info1.equals(oldPassword)) {
                fw.write(newPassword + "\n");
                find = false ;
            }
            else {
                fw.write(info1 + "\n");
            }
        }
        if(find) {
            System.out.println("password not found");
        }
        else {
            System.out.println("password found");
        }
        fw.close();
    }
}