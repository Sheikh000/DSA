import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");

        int n = sc.nextInt();
        int tax;
        if (n < 500000) {
            tax = 0;
            System.out.println("no tax");
        } else if (n >= 500000 && n <= 100000) {
            tax = (int) (n * 0.18);

        } else {
            tax = (int) (n * 0.3);

        }
        System.out.println("your tax is " + tax);
        sc.close();
    }
}
