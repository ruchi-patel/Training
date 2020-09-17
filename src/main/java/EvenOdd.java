public class EvenOdd {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String result = (number%2 == 0 ? "Even": "Odd");
        System.out.println(result);
    }
}
