package Lambdas.lambdas2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Version1
        SomethingDoer somethingDoer = new SomethingDoer();
        Thread t1 = new Thread(somethingDoer);
        t1.start();

        //version2
        Runnable runnable = ()->{
            System.out.println("Version2");
        };
        Thread t2 = new Thread(runnable);
        t2.start();

        //version3
        Thread t3 = new Thread(
                ()->{
                    System.out.println("Version3");
                }
        );

        List<Student> students = new ArrayList<>();

        students.addAll(List.of(
                new Student(1, "Alok", 26, 90),
                new Student(1, "Ankit", 20, 99),
                new Student(1, "Ankita", 23, 95),
                new Student(1, "Deepak", 30, 88)
        ));

        //Another Example
        Comparator<Student> comparator = (o1,o2)->{
            if(o1.getName().equals(o2.getName())){
                return 0;
            }
            if(o1.getName().compareTo(o2.getName())<0){
                return -1;
            }
            return 1;

        };

        Collections.sort(students,
                (o1, o2)-> {
                    if (o1.getName().equals(o2.getName())) {
                        return 0;
                    }
                    if (o1.getName().compareTo(o2.getName()) < 0) {
                        return -1;
                    }
                    return 1;
                }
        );
        System.out.println(students);

        // Calculator
        MathematicalOperation addition = (o1, o2)->{
            return o1 + o2;
        };

        System.out.println(addition.operation(12, 13));

        MathematicalOperation subtraction = (o1, o2)->{
            return o1 - o2;
        };

        MathematicalOperation addtionOperation = new AdditionalOpertion();
        System.out.println(addtionOperation.operation(12 , 13));



    }
}
