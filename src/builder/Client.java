package builder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.name= "Jalal";
        helper.age=21;
        helper.universityName="Osmania University";

        Student st = new Student(helper);

        System.out.println("Debug");
    }
}
