import java.util.ArrayList;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> dupe= new ArrayList<>();

         System.out.println("enter numbers for arraylist(press  '-1'  to stop");


       while (true) {
        int num= sc.nextInt();

        if (num==-1) {
            break;
        }

        al.add(num);
    }


/*         al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(3);
        al.add(6);
        al.add(1);
 */

    System.out.println();
    System.out.println("list:");
    prt_lst(al);

    System.out.println();

        for(int i=0; i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if (al.get(i).equals(al.get(j))) {
                    if (!dupe.contains(al.get(i))) {                    
                        dupe.add(al.get(i));                    
                    }
                }                
            }
        }

    System.out.println("dupes");
    prt_lst(dupe);

    sc.close();
    }

   static void prt_lst(ArrayList<Integer> a){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
    }
}