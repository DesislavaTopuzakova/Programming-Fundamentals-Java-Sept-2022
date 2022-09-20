package basicSyntax.exercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. цяло число - входни данни
        //2. проверка дали се дели: 10, 7, 6, 3, 2
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 10 == 0) {
            //10 e делител на моето число
            System.out.println("The number is divisible by 10");
        } else if (number % 7 == 0) {
            //7 е делител на моето число
            System.out.println("The number is divisible by 7");
        } else if (number % 6 == 0) {
            //6 e делител на моето число
            System.out.println("The number is divisible by 6");
        } else if (number % 3 == 0) {
            //3 е делител на моето число
            System.out.println("The number is divisible by 3");
        } else if (number % 2 == 0) {
            //2 е делител на моето число
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
