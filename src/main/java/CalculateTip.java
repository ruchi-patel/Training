public class CalculateTip {

    //    3. Calculate tip for the check(eg. Java TipCalculator <check amount> <%tip>)

    public static void main(String[] args) {

        int total_bill = Integer.parseInt(args[0]);
        int tip_percentage = Integer.parseInt(args[1]);

        System.out.println("The tip value is " + (total_bill*tip_percentage)/100);
    }
}
