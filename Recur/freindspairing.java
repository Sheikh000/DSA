public class freindspairing {
    public static int solution(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=solution(n-1);
        int pair=(n-1)*solution(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
