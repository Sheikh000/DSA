import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("numnber is  even");
        } else {
            System.out.println("number is odd");
        }
    }
}
