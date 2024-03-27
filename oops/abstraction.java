public class abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changecolor();
        System.out.println(h.color);
        Fish f=new Fish();
        f.eat();
        f.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("yes");
    }
}
class Fish extends Animal{
    void walk(){
        System.out.println("no");
    }
}
