import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("enter number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter number of columns");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
