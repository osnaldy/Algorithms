public class Encapsulation {

    /* implementation for encapsulation instance variables should be private so the can not be accessed from outside code.
    * Create setter and getter to access get the values of the fields.
    * The whole idea of encapsulation is to hide the implementation details from the users.*/

    private int ssn;
    private String empName;
    private int age;

    public int getEmpSsn() {

        return ssn;
    }

    public String getEmpName() {

        return empName;
    }

    public int getEmpAge() {

        return age;
    }

    public void setSsn(int newValue) {

        ssn = newValue;
    }

    public void setEmpName(String newValue) {

        empName = newValue;
    }

    public void setAge(int newValue) {

        age = newValue;
    }


    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        obj.setEmpName("Osnaldy Vasquez");
        obj.setSsn(123456789);
        obj.setAge(28);

        System.out.println(obj.getEmpName());
        System.out.println(obj.getEmpSsn());
        System.out.println(obj.getEmpAge());

    }
}
