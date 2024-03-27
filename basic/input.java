import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
