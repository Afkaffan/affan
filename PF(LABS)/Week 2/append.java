import java.util.Scanner;
class append {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 

      System.out.println("give a random word to reverse");

    String s1=sc.next();
    String s2="";

    int n=s1.length();
          
    for (int i=n-1;i>=0;i--){

        s2= s2+s1.charAt(i);

    } 

    System.out.println(s2);
    
  }
}