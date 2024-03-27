public class bruteforcemaxsubarraysum {
    public static void maxsubarraysum(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){//to find the start
           
            for(int j=i+1;j<n.length;j++){//to find the end
                currsum=0;
            
                for(int k=i;k<=j;k++){//just to print the subarrays
                    //subarraysum
                    currsum=currsum+n[k];
                  

                 }
                 System.out.println(currsum);
                 if(maxsum<currsum){
                    maxsum=currsum;
                 }
                
               
            }
           
        }
        System.out.println("maxsum is "+maxsum);
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        maxsubarraysum(n);
    } 
}
