package methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> 2 цели числа
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        //2. long fact на първото число (number1)
        long fact1 = calculateFactorial(number1); //факториела на първото число

        //3. long fact на второто число (number2)
        long fact2 = calculateFactorial(number2); //факториела на второто число

        //4. fact на първото число / fact на второто число = дробно число
        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
    }

    //метод, който намира факториела (long) на дадено число и ми го връща
    public static long calculateFactorial(int number) {
        //5! = 1 * 2 * 3 * 4 * 5 = 120
        //10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800

        long fact = 1; //стойността на факториела
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
