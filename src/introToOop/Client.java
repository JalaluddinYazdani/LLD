package introToOop;

public class Client {
    public static void main(String[] args) {
        Student saloni = new Student();
        saloni.name="Saloni";
        saloni.batchName="June2023";
        saloni.psp=95.64;
        saloni.univName="Osmania University";

        System.out.println(saloni.name);

        Student obaid = new Student();
        System.out.println(obaid.name);

        obaid.GivingInterview();

        saloni.changeBatch("Sept 2024");
        System.out.println(saloni.batchName);
    }

}
