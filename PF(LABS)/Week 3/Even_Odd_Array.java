
public class Even_Odd_Array {
    public static void main(String[] args) {

        int[] num={1,2,3,4,5,6,7,8,9};
        int even=0;
        int odd=0;

        for(int i=0; i<num.length;i++){
            if(num[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }

        System.out.println("even count="+even);
        System.out.println("odd count="+odd);

    }
    
}
