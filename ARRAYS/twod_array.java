import java.util.Scanner;

public class twod_array {
    public static void largest(int matrix[][]){
        int l=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(l<matrix[i][j]){
                    l=matrix[i][j];
               }
            }
        }
        System.out.println("largest element in array is :"+l);
        
    }
    public static void smallest(int matrix[][]){
        int s=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(s>matrix[i][j]){
                    s=matrix[i][j];
               }
            }
        }
        System.out.println("smallest element in array is :"+s);
        
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length ,m=matrix[0].length;
        //input
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        largest(matrix);
        smallest(matrix);
        
    }
}
