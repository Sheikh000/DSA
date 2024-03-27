public class polyloading {
    public static void main(String[] args) {
        Calc s=new Calc();
        System.out.println(s.sum(1, 2));
        System.out.println(s.sum((float)1.3, (float)2.4));
        System.out.println(s.sum(1, 2,5));
    }
}

class Calc{
    int sum(int a ,int b){
        return a+b;

    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
