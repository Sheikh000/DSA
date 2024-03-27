import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number for sum of first n natural number");
        int n = sc.nextInt();
        int a, b, c;
        a = n + 1;
        b = a * n;
    c = b / 2;
        System.out.println("sum of first " + n + " natural number is " + c);
        sc.close();

    }
}
