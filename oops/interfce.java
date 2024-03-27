public class interfce {
    public static void main(String[] args) {
        Queens q=new Queens();
        q.moves();
        Bear b= new Bear();
        b.eatsnonveg();
        b.eatsveg();
    }
}
interface Herbivore{
    void eatsveg();
}
interface Carnivore{
    void eatsnonveg();
}
class Bear implements Herbivore,Carnivore{
    public void eatsveg(){
        System.out.println("eats  veg");
    }
    public void eatsnonveg(){
        System.out.println("eats non veg");
    }
}
interface Chessplayer{
    void moves();
}
class Queens implements Chessplayer{
    public void moves(){
        System.out.println("all dir");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("one square in all dir");
    }
}
class pawn implements Chessplayer{
    public void moves(){
        System.out.println("two sqaure first time one square then onwards");
    }
}