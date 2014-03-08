package p2;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        int num;
        int factorial = 1; // 0! = 1
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive Integer: ");
        num = scan.nextInt();
        
        while (num < 0) {
            System.out.print("A nonnegative number is required."
                    + "\nPlease enter another number:");
            num = scan.nextInt();
        }
        while (num > 0) {
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
    }
}
