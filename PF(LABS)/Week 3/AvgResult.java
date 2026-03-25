import java.util.Scanner;

public class AvgResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("number of subjects to find there sum=");
        int a = sc.nextInt();
        
        double[] arr = new double[a];
        double sum=0;
        double avg=0;

        for(int i=0;i<arr.length;i++){

            System.out.println("subject no."+(i+1)+"=");
            arr[i]=sc.nextDouble();

        }

        for(int i=0;i<arr.length;i++){
            sum= arr[i]+sum;
        }
    
        avg=sum/arr.length;
        System.out.println("your avg is = "+avg);
    

        sc.close();
    }
}
