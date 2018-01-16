class PhysicsTeacher {

    String designation = "Teacher";

    String collegeName = "Beginner's Book";
    void does(){
        System.out.println("Teaching");
    }

}

public class Inheritance extends PhysicsTeacher{

    String  mainSubject = "Physics";
    public static String staticVar = "Hello World";

    public static void main(String[] args) {

        Inheritance obj = new Inheritance();
        Inheritance obj1 = new Inheritance();

        System.out.println(obj.designation);
        System.out.println(obj.collegeName);
        System.out.println(obj.mainSubject);
        obj.does();

        System.out.println(obj.staticVar);
        System.out.println(obj1.staticVar);
        obj.staticVar = "Osnaldy";
        System.out.println(obj1.staticVar);
        System.out.println(obj.staticVar);
    }
}