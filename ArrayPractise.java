// creating a n array of three students that will print out their details

class Student {
    int age;
    String name;
    int marks;
}

public class ArrayPractise {
    public static void main(String[] args) {
        Student s1 = new Student(); // creating the student object
        s1.age = 20;
        s1.marks = 90;
        s1.name = "Khalifa";

        Student s2 = new Student();
        s2.age = 15;
        s2.marks = 40;
        s2.name = "Boows";

        Student s3 = new Student();
        s3.age = 30;
        s3.marks = 80;
        s3.name = "Shamimi";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

      //  for (int i = 0; i < students.length; i++) {
           // System.out.println(students[i].name + " " + students[i].marks);
       // }


       //enhanced for loop implementation
        for (Student stud:students){
            System.out.println(stud.name + ": " + stud.marks);
        }
    }
}
