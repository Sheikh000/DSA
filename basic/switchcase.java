import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number on which u want to perform calculations");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the number for following task");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for divison");
        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int div = a / b;
        int button = sc.nextInt();
        do {
            switch (button) {
                case 1:
                    System.out.println(sum);
                    break;
                case 2:
                    System.out.println(sub);
                    break;
                case 3:
                    System.out.println(multiply);
                    break;
                case 4:
                    System.out.println(div);
                default:
            }
        } while (button != 5);

    }
}
