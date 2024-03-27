public class decreasing {
    public static void printdec(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        printdec(n-1);

    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);

    }
    public static int sumofn(int n){
        if(n==0){
            return 0;
        }
        return n+sumofn(n-1);
    }
    public static  int  fib(int n){
        if(n==0 ||  n==1){
            return n;
        }
        
        return fib(n-1)+fib(n-2);
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstoccur(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccur(arr, i+1, key);
        

    }
    public static int lastoccur(int arr[],int i,int key){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccur(arr, i-1, key);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical=tilingproblem(n-1);
        int horizontal=tilingproblem(n-2);
        int totways=vertical+horizontal;
        return totways;
    }
    public static void main(String[] args) {
       /*int n=25;
       int result=fib(n);
        System.out.println(result); 
        int arr[]={1,4,5,3,2,6,4,6,7,8};
        System.out.println(lastoccur(arr, 8,4));
        */
        System.out.println(tilingproblem(3));
      
        
    }
}