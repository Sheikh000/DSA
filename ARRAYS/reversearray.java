public class reversearray {
    public static int reverse(int n[]){
        int first=0,last=n.length-1;
        while(first<last){
            int temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;

        }
        return -1;
    }

    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        reverse(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}
