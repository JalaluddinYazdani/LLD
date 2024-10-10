package synchronization.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Object> queue,int maxSize,String name,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.queue=queue;
        this.maxSize=maxSize;
        this.name = name;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;

    }
    @Override
    public void run() {
        while(true){
            try{
                consumerSemaphore.acquire();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            queue.remove();
            System.out.println(this.name + ": Consume a shirt. " +
                    "New queue size: " + queue.size());
            producerSemaphore.release();
        }
    }
}
