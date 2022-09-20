package basicSyntax.exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //2. крайна сума =
        // (countHeadset * headsetPrice)
        // + (countMouse * mousePrice)
        // + (countKeyboard * keyboardPrice)
        // + (countDisplay * displayPrice)

        int countHeadset = lostGames / 2; //бр. слушалки
        int countMouse = lostGames / 3; //бр. мишка
        int countKeyboard = lostGames / 6; //бр. клавиатурите
        int countDisplay = lostGames / 12; //бр. монитори

        double finalSum = (countHeadset * headsetPrice)
                + (countMouse * mousePrice)
                + (countKeyboard * keyboardPrice)
                + (countDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);


    }
}
