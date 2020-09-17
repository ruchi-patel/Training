package ExceptionPrograms;
// 2. Take input from user as username if the username is not "test"
// then throw user defined exception "UserNotFoundException" .

import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) throws UserdefinedException {
        String username = "test";
        System.out.println("Enter username:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(username)){
            System.out.println("Correct");
        }
        else{
            throw new UserdefinedException("UserNotFoundException");
        }
    }
}
