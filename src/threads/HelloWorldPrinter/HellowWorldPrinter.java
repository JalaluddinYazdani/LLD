package threads.HelloWorldPrinter;

public class HellowWorldPrinter implements  Runnable{
    public void run(){
        System.out.println("Hello World! IN a different Thread.Printed by thread"+Thread.currentThread().getName());
    }
}
