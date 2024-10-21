/*
 * lambda expression only works with functional
 * interface
 * functional interface has only one method
 */

@FunctionalInterface
interface A {
    int add(int i, int j);
  
}

public class Lambda {
    public static void main(String[] args) {
        A obj = (int i, int j) -> i + j;
        int result = obj.add(5, 8);
        System.out.println(result);
    };
}
