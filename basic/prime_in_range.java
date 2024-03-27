public class prime_in_range {
    public static void range(int n){
        for(int i=2 ;i<n;i++){
            if(isprime(i)){
                System.out.print( i+" " );
            }
        }
        System.out.println();
    }
    public static boolean isprime(int n) {
        if(n==2){
            return true;
            
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     range(20);
    }
}
