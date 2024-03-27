import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(int n){
        int palindrome=n;
        int reverse=0;
        while(palindrome!=0){
            int remainder=n%10;
            reverse=reverse*10 + remainder;
            palindrome=palindrome/10;

        }
        if(n==reverse){
            return true;
        }
        return false;

       
    }
    public static void main(String[] args) {
        System.out.println("Please Enter a number : ");
Scanner sc = new Scanner(System.in);
int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");
}
    }
}
