import java.util.Scanner;
public class Multiplication_Table {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int start=1;

      System.out.println("multiplication table for=?");
        int userinput= sc.nextInt();

      System.out.println("till=?");
       int limit= sc.nextInt();
  
    while (start<=limit) {
      
      System.out.println(userinput+" x "+start+"="+userinput*start);
      start++;

    }
  }
}