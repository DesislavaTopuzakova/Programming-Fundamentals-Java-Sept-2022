package basicSyntax.exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. цяло число
        //2. проверка дали е strong
        //ако е strong -> "yes"
        //ако не е strong -> "no"

        int number = Integer.parseInt(scanner.nextLine()); // стойността на числото, която ще модифицирам
        int startNumber = number; //първоначално въведената стойност на числото

        //за всяка цифра
        //1. цифра -> 1. последната цифра (%10) 2. ------  3. премахваме (/10) -> поватаряме: число > 0
        //2. намирам факториел
        //3. сумирам факториела

        int sumFact = 0; //сума от факториелите
        while (number > 0) {
            int lastDigit = number % 10; //последната цифра
            // намирам факториела на числото lastDigit
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            //сумирам факториел
            sumFact += fact;
            number = number / 10; // премахваме последната цифра
        }

        //проверка дали сумата от факт == първ. число
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
