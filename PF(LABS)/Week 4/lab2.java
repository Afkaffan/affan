public class lab2 {
     public static void main(String[] args) {

        int[][] arr= {{1,2,3},{8,5,2},{7,5,1}};
     
        matPRINT(arr);
    }
    
    static void matPRINT(int[][] a){
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[i].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }}
}