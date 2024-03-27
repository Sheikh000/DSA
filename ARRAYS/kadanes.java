public class kadanes {
    public static void kadane(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            currsum=currsum+n[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum, currsum);
        }
        System.out.println("Maximum sum of the array is : "+ maxsum);
    }
    public static void main(String[] args) {
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(n);
    }
}
