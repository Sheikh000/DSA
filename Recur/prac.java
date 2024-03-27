
public class prac {
    public static int removeduplicate(int arr[],int n){
        
       
        int j = 0;
 
        for (int i = 0; i <n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
 
        arr[j++] = arr[n-1];
 
        return j;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,6,7};
        int j=0;
        int n=arr.length;
       
       
        j = removeduplicate(arr,n);
 
        
        for (int i = 0; i < j; i++)
            System.out.print(arr[i] + " ");

    }
}
