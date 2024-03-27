public class binomialcoeff {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bbbccc(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);
        int d = a / (b * c);
        return d;
    }

    public static void main(String[] args) {
        int ncr = bbbccc(5, 2);
        System.out.println(ncr);
    }
}
