import java.util.Scanner;

public class Matrix_addtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matA = new int[3][3];
        int[][] matB = new int[3][3];
        int[][] matC = new int[3][3];

        System.out.println("Matrix A");

        for(int i = 0; i < matA.length; i++){
            for(int j = 0; j <  matA.length; j++){
                System.out.println("Enter element at row " + (i+1) + " column " + (j+1));
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix B");

        for(int i = 0; i <  matB.length; i++){
            for(int j = 0; j < matB.length; j++){
                System.out.println("Enter element at row " + (i+1) + " column " + (j+1));
                matB[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("Matrix A + Matrix B =");

        for(int i = 0; i < matC.length; i++){
            for(int j = 0; j < matC.length; j++){
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}