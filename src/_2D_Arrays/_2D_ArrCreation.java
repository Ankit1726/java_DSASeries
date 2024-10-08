package _2D_Arrays;
import java.util.Scanner;

public class _2D_ArrCreation {
    public static boolean Search(int matrix[][],int key){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("Found at cell -> "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found ");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // Input Array
        int n=matrix.length,m=matrix[0].length;
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your matrix element -> ");
        for (int i=0;i<n;i++){
            for (int  j=0;j<m;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        // Output
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(matrix,5);
    }
}
