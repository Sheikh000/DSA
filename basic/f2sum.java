import java.util.Scanner;

public class f2sum {
    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a, b);
        sc.close();
    }
}
