import java.util.Scanner;

public class f1 {
    public static void myname(String name) {
        System.out.println(name);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        myname(name);
        sc.close();

    }
}
