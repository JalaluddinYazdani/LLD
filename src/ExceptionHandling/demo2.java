package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) {
        try{
            System.out.println("Hi");
            System.out.println("Hello");

            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();

            System.out.println("Bye");
            System.out.println("Bye2");
        }catch(InputMismatchException inputMismatchException){
            inputMismatchException.printStackTrace();
            System.out.println("A Bug has been logged into the logger file");
        }
        System.out.println("Your program has not crashed and it has run gracefully");
    }
}
