package methods;

import java.util.Scanner;

public class SmallestNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> 3 цели числа
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(number1, number2, number3);
    }

    //метод, който връща най-малкото от три цели числа
    public static void printSmallestNumber (int n1, int n2, int n3) {
        //1-вото да е най-малко
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        }
        //2-рото да е най-малко
        else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        }
        //3-тото да е най-малко
        else if (n3 <= n1 && n3 <= n2) {
            System.out.println(n3);
        }
    }


}
