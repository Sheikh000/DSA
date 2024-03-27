import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check if it is prime or not");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
