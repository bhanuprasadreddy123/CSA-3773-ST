import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int age, shrt;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your age:");
        age = scan.nextInt();
        scan.close();

        if (age >= 18) {
            System.out.println("Welcome to the voting system. You can vote.");
        } else {
            shrt = 18 - age;
            System.out.println("Sorry, you can vote after " + shrt + " years.");
            
            // Manual check instead of JUnit assertion
            if (shrt != 18 - age) {
                throw new RuntimeException("Calculation error: shrt should be " + (18 - age));
            }
        }
    }
}
