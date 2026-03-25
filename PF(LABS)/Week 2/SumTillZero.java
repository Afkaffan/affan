import java.util.Scanner;

class SumTillZero {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a=0;
    int num;

    while (true) {
        
        System.out.println("type a number(0 to exit)=");
        num= sc.nextInt();

            if (num==0) {
            break;
            }

        a=num+a;

    }

    System.out.println(a);

    }
}