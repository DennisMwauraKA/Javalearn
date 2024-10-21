
class Human {

    /** this is a constructor it has the same name as the class 
     * 
     *this is when you want to use the same values eg database connection
    */
    public Human() {/*default constructor */
     age=22;
     name="geret";
    }
    public Human(int a , String n) { // parmeterized constructor
     age=a;
     name= n;
    }

    private int age; // instance variables should be private, it should be accessed indirectly using
                     // methods
    private String name;

    // using getters and setters to set and get variables for private variables
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(18, "Alexia"); // parameterized constructor in action
        obj.setAge(40);
        obj.setName("Dennis");
System.out.println(obj1.getAge() +": " + obj1.getName());
    }

}
