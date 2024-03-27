public class polyoverride {
    public static void main(String[] args) {
        Dear d=new Dear();
        d.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Dear{
    void eats(){
        System.out.println("eats grass");
    }
}
