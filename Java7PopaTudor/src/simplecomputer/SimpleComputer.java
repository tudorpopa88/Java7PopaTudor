/*
 * Simple computer
 */
package simplecomputer;

import java.util.Scanner;

/**
 *
 * @author tudor
 */
public class SimpleComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    Starting from first java program we created in our training session, please implement a desk computer. It should work following the steps:
//
//1. Display in console "Please introduce your first number:"
//
//2. Read first number from console
//
//3. Please introduce operator(+/-/*//)
//
//4. Read operator
//
//5. Please introduce second number
//
//6. Read second number from console
//
//7. Please introduce "="
//
//8. Read from console
//
//9. Result is: 
//
//10. Display final result 
//
//Remark: in case of any bad insert of information program display: "Sorry, you introduced wrong data. I quit :)" and close the program (end it ;))

        System.out.println("Please introduce your first number: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int firstNumber = Integer.parseInt(input);
        System.out.println("Please introduce operator (+/i/*//): ");
        Scanner keyboard1 = new Scanner(System.in);
        input = keyboard1.nextLine();
        char operation = input.charAt(0);
        System.out.println("Please introduce your second number: ");
        Scanner keyboard2 = new Scanner(System.in);
        input = keyboard2.nextLine();
        int secondNumber = Integer.parseInt(input);
        int result = 0;
        
        switch(operation) {
            case '+': result = firstNumber + secondNumber;
                break;
            case '-': result = firstNumber - secondNumber;
                break;
            case '*': result = firstNumber * secondNumber;
                break;
            case '/': result = firstNumber / secondNumber;
                break;
            default: System.out.println("Sorry, you introduced wrong data. I quit :)\" and close the program (end it ;)");
                break;
        }
        
        System.out.println("Result is: " + result);
    }

}
