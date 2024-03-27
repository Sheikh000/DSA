public class prefixmaxsubarraysum {
    public static void maxsubarraysum(int n[]){
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[n.length];
        prefix[0]=n[0];
        for(int i=1;i<n.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int currsum=0;
            for(int j=i;j<n.length;j++){
                currsum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        System.out.println("maxsum is "+ maxsum);
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        maxsubarraysum(n);

    }
}
