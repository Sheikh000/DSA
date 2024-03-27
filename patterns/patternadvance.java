public class patternadvance {
    public static void p1(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void p2(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void p3(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
    public static void p4(){
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
        }
    }

    
    public static void main(String[] args) {
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        p4();
    }
}
