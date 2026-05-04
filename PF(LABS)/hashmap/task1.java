import java.util.ArrayList;

public class task1{
 public static void main(String[] args) {

    ArrayList<Integer> number= new ArrayList<>();
    number.add(5);
    number.add(-3);
    number.add(8);
    number.add(-1);
    number.add(12);
    number.add(-7);
    number.add(4);

System.out.println("before removing/input");

    prt_lst(number);


System.out.println();


    for(int i=0;i<number.size();i++){
        int a = number.get(i);
        if (a<0) {
            number.remove(i);
        }
    }

System.out.println("after removing/output");

    prt_lst(number);
    
 }    

static void prt_lst(ArrayList<Integer> a){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
 }
}
