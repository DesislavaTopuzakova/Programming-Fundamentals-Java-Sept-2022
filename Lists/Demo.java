package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(14);
        numbers.add(3);

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        //numbers.toString -> "[5, 9, 14, 3]"
    }
}
