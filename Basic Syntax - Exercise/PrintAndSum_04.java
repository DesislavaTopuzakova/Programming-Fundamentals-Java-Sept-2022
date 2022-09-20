package basicSyntax.exercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> цяло число за начало; цяло число за край
        //2. отпечатвам всички числа в дадения диазпазон
        //3. намирам и опечатвам сумата

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        //for цикъл
        //1. начална стойност -> startNumber
        //2. крайна стойност -> endNumber
        //3. повтаряме -> отпечатваме числото
        //4. промяна -> + 1

        int sum = 0; //сумата на числата
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum = sum + number;   // sum += number;
        }

        System.out.println(); //свалям курсора на нов ред
        System.out.println("Sum: " + sum);


    }
}
