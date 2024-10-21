/*enums are basically constants */
enum Status {
    Running, Failed, Pending
}

public class Demoenums {

    public static void main(String[] args) {
        Status s = Status.Running;
        if (s == Status.Running)
            System.out.println("running already");
    }

}
