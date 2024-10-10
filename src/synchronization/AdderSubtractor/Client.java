package synchronization.AdderSubtractor;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder add = new Adder(count);
        Subtractor sub = new Subtractor(count);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();

        // Waits for t1 and t2 to complete
        t1.join();
        t2.join();

        System.out.println("Both the threads have completed" +
                "count: " + count.value);


    }
}
