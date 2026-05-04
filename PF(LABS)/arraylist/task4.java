import java.util.ArrayList;
public class task4 {
    public static void main(String[] args){
        ArrayList<Integer> num= new ArrayList<>();
        
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        int a;


        for(int i=0,j=num.size()-1;j>i;i++,j--){
            a=num.get(i);
            num.set(i, num.get(j));
            num.set(j, a);
        }

        prt_lst(num);

        
    }    
       static void prt_lst(ArrayList<Integer> a){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
    }
}
