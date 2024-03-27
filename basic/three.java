import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("how many numbers how you entered");
        int n = sc.nextInt();

        int sum = (a + b + c) / n;
        System.out.println(sum);

        sc.close();
    }
}
