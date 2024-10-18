class Computer {
    public String getMeApen(int cost) {
        return "pen";
    }
}

public class Methods {

public static void main(String[] args) {
    
    Computer obj =new Computer();
    String str =obj.getMeApen(10);

    System.out.println(str);
   }
}
