package synchronization.AdderSubtractorSynchronized;

public class Adder implements Runnable {
    private Count count;
    private Count count1;

    public Adder(Count count,Count count1){
        this.count=count;
        this.count1=count1;

    }

    @Override
    public void run() {
        for(int i=0;i<=10000;i++){
            synchronized (count){
                count.value+=i;
                count1.value+=i;
            }
        }
    }
}
