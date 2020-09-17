public class Multiply {

    //    2.Multiply three values using commandline inputs.

    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        System.out.println("The multiplication of values is:" + number1*number2*number3);
    }
}
