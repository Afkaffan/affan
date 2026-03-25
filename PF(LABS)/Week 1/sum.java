import java.util.Scanner;
import java.util.scanner;

import javax.print.DocFlavor.STRING;
public class sum {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        int sum= 0;

        for(int i=0; i < num.length();i++){

            sum= sum + (num.charAt(i) -'0');
                        
        }
        
         System.out.println(sum);    
    }
}
