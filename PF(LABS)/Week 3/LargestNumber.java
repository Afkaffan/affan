import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] value= new int[5];

    System.out.println("Enter 5 number=");

        for(int i=0;i<value.length;i++){
            value[i]= sc.nextInt();
        }

        int big= value[0];

        for(int i=1;i<value.length;i++){
            if (value[i] > big){
                big = value[i];
            }
        }    
    System.out.println(big);

    sc.close();
    }
}
