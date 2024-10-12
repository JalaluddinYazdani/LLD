package FunctionInterface;

import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class FuncDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,String> biConsumer = new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("Bi COnsumer Impl:"+s+""+integer);
            }
        };
        biConsumer.accept(10,"hello");

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        };

        System.out.println("BinaryOperation"+binaryOperator.apply(9,9));
    }
}
