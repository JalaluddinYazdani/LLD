package accessModifiers;

public class Student {
    public static String univName = "Osmania University";
    private String Name;
    int batchId;
    protected double psp;

    public static void main(String[] args) {
        Student st = new Student();
        st.Name="Jalal";
        System.out.println(st.Name);
    }
}
