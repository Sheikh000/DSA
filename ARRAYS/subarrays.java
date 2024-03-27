public class subarrays {
    public static void printsubarray(int n[]){
        for(int i=0;i<n.length;i++){//to find the start
           
            for(int j=i+1;j<n.length;j++){//to find the end
                
                for(int k=i;k<j;k++){//just to print the subarrays
                    System.out.print(n[k]+" ");
                  }
                
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        printsubarray(n);
    }
}
