import java.util.Scanner;
public class perpend {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 

    System.out.println("give a random word to reverse");
    
    String s1=sc.nextLine();
    String reverse="";

    int n=s1.length();
    int i=0;
    
    for (;i<n;i++){ 
            
     reverse= s1.charAt(i)+reverse;                 
       
        }

    System.out.println(reverse);

    }
}

