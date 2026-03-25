import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many number do you want to sum?");
        int a= sc.nextInt();

        int[] arr = new int[a];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Type " + (i+1) + "/"+ a +" number to sum:");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
