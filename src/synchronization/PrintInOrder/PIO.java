package synchronization.PrintInOrder;

import java.util.concurrent.Semaphore;
public class PIO {
    private Semaphore second;
    private Semaphore third;

    public PIO(){
        second = new Semaphore(0);
        third = new Semaphore(0);

        /*public void first(Runnable printFirst) throws InterruptedException{
            printFirst.run();
            second.release();

        }
        public void second(Runnable printSecond) throws InterruptedException{
            second.acquire();
            printSecond.run();
            third.release();
        }
        public void third(Runnable printThird) throws InterruptedException{
            third.acquire();
            printThird.run();
        }
        */
    }
}
