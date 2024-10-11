package Streams.Streams2;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40);
        Iterator<Integer> iterator = list.listIterator();

        System.out.println("====printing using Iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for(Integer i : list){
//            System.out.println(i);
//        }

        DataAggregator dataAggregator = new DataAggregator();
        List<Integer> li = new ArrayList<>(dataAggregator.getItems());

        Stream<Integer> s1 = dataAggregator.getItems().stream();
        //s1.forEach(System.out::println);

        s1.forEach((elem)->{
            System.out.println(elem*2);
        });

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Stream<Integer> s2 = set1.stream();

//        Consumer<Integer> consumer = (elem)->{
//            System.out.println(elem*2);
//        }

        s2.forEach((elem)->{
            System.out.println(elem*2);
        });

//        class MyConsumer implements Consumer<Integer>{
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer*2);
//            }
//        }
//
//        MyConsumer myConsumer = new MyConsumer();
//        for(Integer i : list){
//            myConsumer.accept(i);
//        }

        List<Integer> l10 = List.of(10,20,30,40);
        Set<Integer> set = new HashSet<>();

        Stream<Integer> stream = l10.stream();
        stream.forEach((elem)->{
            set.add(elem);
        });

        System.out.println(set);

        //Traditional Method
        for(Integer i : l10){
            if(i%2==0){
                System.out.println(i*2);
            }
        }
        System.out.println("Printing using the filter method");
        l10.stream().filter(
                // If your lambda function has just 1 line and the result
                // of that line is what you want your lambda function
                // to return, then there is no need to put a return
                (elem)-> elem%2==0
        ).forEach(
                (elem)->{
                    System.out.println(elem*2);
                }
        );

        //multiply all numbers by 3 and print all less tha 10
        l10.stream().map(
                (elem)->elem*3
        ).filter(
                (elem)-> elem<10&&elem>1
        ).forEach(
                System.out::println
        );

        Stream<Integer> stream1 =l10.stream().map(
                (elem)->elem*3
        ).filter(
                (elem)->elem<10&&elem>1
        );

        List<Integer> listAns = new ArrayList<>();

        for (Integer integer : l10) {
            if (integer * 3 < 10) {
                listAns.add(integer);
            }
        }

        System.out.println(l10);
    }
}
