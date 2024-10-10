package threads.executors;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;


public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0 ;i<=100;i++){
            if(i==5 || i==11 || i==20 || i==50){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
        executorService.shutdown();
    }
}
