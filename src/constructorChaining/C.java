package constructorChaining;

public class C extends B{
    public C(){
        System.out.println("C is doing Something");
    }
    public C(String name){
        System.out.println("C is doing Something"+name);
    }
}
