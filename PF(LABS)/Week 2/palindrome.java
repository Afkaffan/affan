import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("type a random word");

        String word= sc.nextLine();
        
        int n=word.length();
        Boolean pal= false;

            for(int a=0, b=n-1; a<b; b--, a++){
            if (word.charAt(a)==word.charAt(b)) {
                pal= true;
                break;
            }
        }
        
        if (pal) {System.out.println("this word is a palindrome");}
       
        else{System.out.println("this word is not a palindrome");}
    }
}