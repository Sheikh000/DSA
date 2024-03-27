import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int ch;
        int even = 0;
        int odd = 0;
        do {
            System.out.println("enter any number");
            n = sc.nextInt();
            if (n % 2 == 0) {
                even = even + n;
            } else {
                odd = odd + n;
            }
            System.out.println("press 1 if you want to enter more numbers else press 0");
            ch = sc.nextInt();
        } while (ch == 1);
        System.out.println("sum of even numbers is " + even);
        System.out.println("sum of odd numbers is " + odd);

        sc.close();
    }
}
