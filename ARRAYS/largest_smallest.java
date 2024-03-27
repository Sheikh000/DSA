public class largest_smallest {
    public static int largestandsmallest(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];

            }
            if(smallest>n[i]){
                smallest=n[i];
            }
        }
        System.out.println("the Smallest value is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int n[]={1,3,2,4,6,5,7,3,5};
        System.out.println("the largest value is "+ largestandsmallest(n));
        
    }
}
