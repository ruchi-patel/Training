package ExceptionPrograms;//Exception HAndling Practice Program :
// 1. Take input as age from user if the age is < 18 then throw user defined exception UnderAgeException.


import java.util.Scanner;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        validate(input);
        System.out.println("User is NOT under age..");
    }

    private static void validate(int input) {
        if (input < 18) {
            throw new UnderAgeException("Under Age");
        }
    }
}
