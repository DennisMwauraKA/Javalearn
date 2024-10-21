package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        /*
         * create the instance of Advance calc as
         * properties of Calc class are being used
         */
        MoreAdvanceCalc calc = new MoreAdvanceCalc(); // instance of the Advance Class created
        int r4 = calc.multiply(10, 20);
        int r1 = calc.add(10, 20);
        int r2 = calc.divide(30, 8);
        int r3 = calc.sub(30, 8);
        double r5 = calc.power(2,9);
    
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
