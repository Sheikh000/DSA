public class padvance{
    public static void p1(){
        //hollow rectangle
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==4 || j==1 || j==5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void p2(){
        //inverted rotated half pyramid
        for(int i=1;i<=4;i++){
            //forspaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p3(){
        //inverted half pyramid with numbers
        for(int i=1;i<=5;i++){
            for(int j =1;j<=5-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void p4(){
        //floyd triangle
        int x=1;
        for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(x+" ");
                x++;
                }
            System.out.println();
        }
    }
    public static void p5(){
        //0-1 triangle
        for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                

            }
            System.out.println();
        }
    }
    public static void p6(){
        //butterfly pattern
        //1sthalf
        // stars(i)+spaces(2*(n-1))+stars(i)
        for(int i=1;i<=4;i++){
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
             }
             //space
             for(int j =1;j<=2*(4-i);j++){
                System.out.print(" ");
             }
             //stars
             for(int j =1;j<=i;j++){
                System.out.print("*");
             }
             
             System.out.println();
        } for(int i=4;i>=1;i--){
            //stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
             }
             for(int j =1;j<=2*(4-i);j++){
                System.out.print(" ");
             }
             for(int j =1;j<=i;j++){
                System.out.print("*");
             }
             
             System.out.println();
        }

    }
    public static void p7(){
        //solid rhombus
       
        // space(n-i)+star(5)
        for(int i=1;i<=5;i++){
            //space
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
             }
             //star
             for(int j =1;j<=5;j++){
                System.out.print("*");
             }
             
             System.out.println();
        }
    }
    public static void p8(){
        //solid hollow rhombus
       
        // space(n-i)+star(5)like hollow rectangle
        for(int i=1;i<=5;i++){
            //space
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
             }
             for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
             
        }
    }
    public static void p9(){
        //diamond pattern
        //space (n-i)+star(2i-1)+space(n-i)
        //1sthalf
        //outerloop
        for(int i=1;i<=4;i++){
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            System.out.println( );
        }
        //2nd half
        for(int i=4;i>=1;i--){
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
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
        System.out.println();
        p5();
        System.out.println();
        p6();
        System.out.println();
        p7();
        System.out.println();
        p8();
        System.out.println();
        p9();
    }
}