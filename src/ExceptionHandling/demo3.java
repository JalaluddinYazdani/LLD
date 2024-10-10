package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Hi");
            System.out.println("Hello");

            //Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();

            System.out.println("Bye");
            System.out.println("Bye2");

            if(val%2==0) return;
        }catch(InputMismatchException inputMismatchException){
            // log the exception
            inputMismatchException.printStackTrace();
            System.out.println("catch block: A bug has occured and it has been logged");
        }
        finally {
            System.out.println("Finally block : CLosing Scanner Connection");
            sc.close();
        }

        //        System.out.println("for testing purpose");
        //        in.close();

        System.out.println("Last: Your program has not crashed. It has exited gracefully");

    }

}
