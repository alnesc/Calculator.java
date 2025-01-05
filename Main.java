import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        double a = scan.nextDouble();
        scan.nextLine();
        System.out.println("Input operation:");
        String operation = scan.nextLine();
        System.out.println("Input second number:");
        double b = scan.nextDouble();
        if(operation.equals("+"))
            System.out.println("Answer is:"+plus(a,b));
        if(operation.equals("-"))
            System.out.println("Answer is:"+minus(a,b));
        if(operation.equals("/"))
            System.out.println("Answer is:"+divide(a,b));
        if(operation.equals("*"))
            System.out.println("Answer is:"+multiply(a,b));
        if(operation.equals("^")) {
            int i = (int)b;
            System.out.println("Answer is:" + power(a,i));
        }
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("You can't divide by zero");
        }
        return a / b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double power(double a, int deg) {
        double res = 1;
        int deg2 = Math.abs(deg);
        for (int i = 0; i < deg2; i++)
            res *= a;
        return deg < 0 ? 1.0 / res : res;
    }
}