import java.util.Scanner;
public class seacrh_index {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        int[] num= {14,45,54,93,78};

        System.out.println("type a number to find its index=()");
        int a= sc.nextInt();
        boolean search=false;

        for(int i=0;i<num.length;i++){
            if(a==num[i]){
                System.out.println("index of "+a+" is "+i);
                search=true;
                break;
            }
            
        }
            if (search==false){
            System.out.println("not found");
    }


    sc.close();
    }
    
}
