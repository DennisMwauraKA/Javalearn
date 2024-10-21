

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

}

/**
 * in this we implement the overloading of the add()method in calc
 */
class AdvanceCalc extends Calc {
    public int add(int n4, int n5) {
        return n4 + n5 + 9;
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvanceCalc obj = new AdvanceCalc();
        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
