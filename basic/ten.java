import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it prime or not");
        int n = sc.nextInt();
        boolean isprime = true;
        if (n == 2) {
            System.out.println(n + " is prime");
        } else {

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
        }
        if (isprime == true) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        sc.close();

    }
}
