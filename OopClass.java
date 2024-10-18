class Calculator { // this is a class with a method add()

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class OopClass {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 9;
        Calculator calc = new Calculator();// creating an object
        int result = calc.add(num2, num1);
        System.out.println(result);
    }
}
