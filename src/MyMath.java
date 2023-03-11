/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;

public class MyMath {
    public static void gcf(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Greatest Common Factor Program, please enter integers to find the greatest common factor for!");
        System.out.print("Please enter an integer: ");
        int a = in.nextInt();
        int firstInt = a;
        System.out.print("Please enter another integer: ");
        int b = in.nextInt();
        int secondInt = b;
        int c = 0;
        while (b != 0) {
            if (a > b){
                c = b;
               b = a % b;
               a = c;
            } else {
                b = b % a;
            }
        }
        System.out.printf("The greatest common factor of %d and %d is: %d%n", firstInt, secondInt, c);
    }
    public static void main(String[] args) {
        gcf();
        System.out.print("Program completed, have a nice day!");
    }
}
