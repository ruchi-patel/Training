package exception.demo;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ExceptionDemo demo = new ExceptionDemo();
        boolean continueFlag = true;
        while(continueFlag) {
            try {
                demo.validateUserInputForInteger(input);
                continueFlag = false;
            } catch (InputValidationException e) {
                input = scanner.nextLine();
            }

        }
        System.out.println("validated input for integer: " + input);
    }

    private void validateUserInputForInteger(String s) throws InputValidationException {
        try {
            Integer.parseInt(s);
            throw new RuntimeException("eeee");
        } catch (NullPointerException e) {
            throw new InputValidationException("invalid user input");
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
            throw new InputValidationException("invalid user input");
        }
    }
}
