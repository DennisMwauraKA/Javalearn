class Human {
    private int age; // instance variables should be private, it should be accessed indirectly using
                     // methods
    private String name;

    // using getters and setters to set and get variables for private variables
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(40);
        obj.setName("Dennis");
        System.out.println(obj.getAge() + ":" + obj.getName());
    }
}
