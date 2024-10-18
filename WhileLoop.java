public class WhileLoop {
    public static void main(String[] args) {
// nested while loop
        int i = 1;
        while (i <= 20) {
            int j = 1;
            while (j <= 3) {
                System.out.println(j);
                j++;
            }
            System.out.println(i);
            i++;
        }
    }
}
