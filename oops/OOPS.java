public class OOPS {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="abcd";
        s1.roll=123;
        s1.pwd="xyz";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);//marks were copied in this statement itself
        s2.pwd="lmn";
        s1.marks[2]=100;/*now we are changing the value of marks ideally this change should not come in the output but it stills comes thats where 
        //shallow and deep constructors come in*/
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
class Student{
    String name;
    int roll;
    String pwd;
    int marks[];

    Student(){
        marks =new int[3];
        System.out.println("Constructor is called");
    }
    /*shallow copyconstructor
    Student(Student s1){
        marks =new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;//here reference of array gets copied not the entire array
        

    }
    */
    //deep copy constructor
    Student (Student s1){
        marks =new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
            
        }

    }
}
