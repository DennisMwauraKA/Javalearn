
// this is method overloading(method with the same name but different parameters)
class Calculator { // this is a class with a method add()

    public int add(int n1, int n2, int n3) {
        return n1 + n2;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 9;
        Calculator obj = new Calculator();// creating an object
        int result = obj.add(num2, num1);
        System.out.println(result);
    }
}
