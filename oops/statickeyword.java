public class statickeyword {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.schoolname="JMV";
        System.out.println(s1.schoolname);
        Students s2=new Students();
        System.out.println(s2.schoolname);
    }
}
class Students{
    String name;
    int roll;
    static String schoolname;

}