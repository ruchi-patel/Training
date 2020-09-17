public class TernaryOperator {

    public static void main(String[] args) {
        int number = -3;
        String answer = (number > 0) ? "positive" : "negative";
        System.out.println(answer);

        int a = 30;
        int b = a-- + --a;
        System.out.println(b);
    }
}
