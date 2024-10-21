class Mobile{
    static String name="phone";
    String brand;
    int price;
    
    public void show(){
        System.out.println(brand + ":" + name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand + ":" + name);
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        


        Mobile obj1= new Mobile();
        obj1.brand="Samsung";
       
        obj1.price=900;

        Mobile obj2= new Mobile();
        obj2.brand="iPhone";
        
        obj2.price=1000;


        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
