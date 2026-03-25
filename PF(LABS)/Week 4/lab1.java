public class lab1{
    public static void main(String[] args) {
       
        int[][] arr= {{1,2,3},{3,4,5}};
        int[][] arr1= {{5,6,7},{7,8,9}};
        int[][] arr2= new int[arr.length][arr1[0].length];

        matADD(arr, arr1, arr2);

        for(int a=0;a<arr.length;a++){
            for(int b=0;b<arr[a].length;b++){
                System.out.print(arr2[a][b]+" ");
            }
            System.out.println();
        }
    }
    
    static void matADD(int[][] a, int[][] b,int[][] c){
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j < b[i].length ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }}}
}
    
