import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of physics ");
        int a = sc.nextInt();
        System.out.println("enter marks of mathematics ");
        int b = sc.nextInt();
        System.out.println("entyer marks of chemistry ");
        int c = sc.nextInt();
        int sum = (a + b + c) / 3;
        System.out.println("your percentage are");
        System.out.print(sum);
        System.out.println("%");

    }
}
