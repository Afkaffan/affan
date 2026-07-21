import java.util.Scanner;

public class credit_card_check {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.println("type your credit card number (with out spaces)");
    String x = sc.nextLine();
    
    if (x.length()!=16) {
        System.out.println("the number you have type is not valid");
    }else{
        
         check(x);  

    }
        }
    
        public static void check(String a){

            int v=0;

            for (int i = 0; i<15 ; i+=2) {
                
                int b = a.charAt(i)-48;
                int c = a.charAt(i+1)-48;

                v+=c;

                b = b * 2;

                if (b>9) {
                    b=b-9;
                }
                
                v+=b;
            }

            if (v%10==0) {
                System.out.println("you card is valid");
            }else{
                System.out.println("you card is invalid");
            }

        }


}   
