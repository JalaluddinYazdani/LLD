package accessModifiers;

public class Client {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.univName);
        //student.Name="Jalal";
        student.batchId=23;
        student.psp=89;
    }
}
