import java.util.jar.JarOutputStream;

public class IfElse {
    // teenager or not

    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age >= 19) {
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are a teenager.");
        }

    }


}
