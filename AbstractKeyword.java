abstract class Car {
    // Abstract method
    public abstract void drive();

   // concrete class
    public void playMusic() {
        System.out.println("play music");
    }
}

class Benz extends Car {
    // Providing implementation for the abstract method
    public void drive() {
        System.out.println("drive");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
        Car obj = new Benz(); 
        obj.drive();
        obj.playMusic();
    }
}
