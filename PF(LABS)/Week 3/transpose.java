import java.util.Scanner;

public class transpose {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

    int[][] arr1 = new int[3][3];
    int[][] transpose = new int[3][3];
       


for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){    
        System.out.println("column "+(i+1)+" row "+(j+1));
        arr1[i][j]= sc.nextInt();
    }
}



System.out.println("original matrix");
for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        System.out.print(arr1[i][j] + " ");
    }
    System.out.println();
}



for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){ 
        transpose[j][i]=arr1[i][j];
    }
}



System.out.println("transpose of matrix");
for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
}
sc.close();

    }
}
