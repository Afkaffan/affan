public class rich {

    public static void main(String[] args) {
        
        int[][] arr1= {{1,2,3},{3,2,1}};
        int[][] arr2={{1,5},{7,3},{3,5}};

        System.out.println("the richest person wealth in this group is "+max(arr1));
        System.out.println("the richest person wealth in this group is "+max(arr2));
    }

    public static int max (int[][] a){
        
        int rich=0;
        int wealth=0;
        
        for(int i=0; i<a.length;i++){
            
            wealth=0;

            for(int j=0; j<a[i].length;j++){
                wealth=wealth+a[i][j];
            }

            if (wealth>rich) {
                rich=wealth;
            }
        }



        return rich;
    }

}
