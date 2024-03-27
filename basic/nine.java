import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {

            int l = n % 10;
            rev = (rev * 10) + l;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
