import java.util.ArrayList;

public class task3{
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);

        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);

        int sum=l1.size()+l2.size();

        for(int i=l1.size(),j=0;i<sum && j<l2.size();i++,j++){
            l1.add(i,l2.get(j));
        }

        l1.sort(null);

        prt_lst(l1);

    }

       static void prt_lst(ArrayList<Integer> a){
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
    }

}