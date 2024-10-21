class Mobile{
static String name="phone";
String brand;
int price;

public void show(){
    System.out.println(brand + ":" + name);
}
}
public class Statickeyword {
    public static void main(String[] args) {
        


        Mobile obj1= new Mobile();
        obj1.brand="Samsung";
       
        obj1.price=900;

        Mobile obj2= new Mobile();
        obj2.brand="iPhone";
        
        obj2.price=1000;


        obj1.show();
        obj2.show();
    }
}
