/*
 * mutiple interfaces can implement one class
 * 
 * class->class - extends
 * class->interface- implements
 * interface->interface- extends
 */

interface A {
    int age = 90;
    String area = "Delhi";

    void show();

    void config();
}




class B implements A {

    public void show() {
        System.out.println("in b show");
    }

    public void config() {
        System.out.println("in b config");
    }

}

public class DemoInterface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
    }
}
