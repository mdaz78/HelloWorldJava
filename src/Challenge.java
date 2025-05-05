public class Challenge {
    public static void main(String[] args) {
        double num1 = 20.00, num2 = 80.00;
        double FACTOR = 100.00;
        double DIVISOR = 40.00;

        double result = (num1 + num2) * FACTOR;
        double remainder = result % DIVISOR;
        boolean hasNoRemainder = remainder== 0;

        if(!hasNoRemainder) {
            System.out.println("got some remainder " + remainder);
        } else {
            System.out.println("no remainder");
        }

        System.out.println(result);
        System.out.println(remainder);
    }
}
