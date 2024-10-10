package threads.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World.Printed by Thread"+Thread.currentThread().getName());
        HellowWorldPrinter helloWorldPrinter = new HellowWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        int a=0;
        for(int i=0;i<=1000000;i++){
            a++;
        }
        System.out.println("Before I end.printed by thread"+Thread.currentThread().getName());
    }
}
