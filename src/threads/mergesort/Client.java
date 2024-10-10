package threads.mergesort;
import java.util.concurrent.*;
import java.util.List;


public class Client {
    public static void main(String[] args) throws ExecutionException , InterruptedException{
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);

        ExecutorService executorService = Executors.newCachedThreadPool();
         MergeSorter mergeSorter = new MergeSorter(list,executorService);
         Future<List<Integer>> sorttedListFuture = executorService.submit(mergeSorter);
         List<Integer> sortedArray = sorttedListFuture.get();
         System.out.println(sortedArray);
    }
}
