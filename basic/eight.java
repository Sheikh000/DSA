import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        while (n > 0) {

            int l = n % 10;
            System.out.print(l);
            n = n / 10;
        }
        System.out.println();
        sc.close();
    }
}
