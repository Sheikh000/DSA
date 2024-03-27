public class bsearch {
    public static int binarysearch(int array[],int key){
        int start=0, end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14,16,18,20};
        int key=14;
        System.out.println("the index of key is : "+ binarysearch(array, key));
    }
}
