public class bubble {
    public static void bubblesort(int n[]){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    int temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;  


                }
            }
        }
    }
    public static void selectionsort(int n[]){
        for(int i=0;i<n.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<n.length;j++){
                if(n[minpos]>n[j]){
                    minpos=j;
                }
                int temp=n[minpos];
                n[minpos]=n[i];
                n[i]=temp;
            }
        }
    }
    public static void printn(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println( );
    }
    public static void main(String[] args){
        int n[]={2,5,4,3,1};
        selectionsort(n);
        printn(n);
    }
}
