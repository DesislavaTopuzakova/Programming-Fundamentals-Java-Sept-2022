package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. списък с цели числа -> входни данни
        //2. въвеждаме команди -> спираме: "End"
        List<Integer> numbers = Arrays.stream(scanner.nextLine() //"1 23 29 18 43 21 20"
                                .split("\\s+"))              //["1", "23", "29", "18", "43", "21", "20"]
                                .map(Integer::parseInt)         //[1, 23, 29, 18, 43, 21, 20]
                                .collect(Collectors.toList());  // {1, 23, 29, 18, 43, 21, 20}

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            //валидна команда
            if (command.contains("Add")) {
                //•	"Add {number}" - add number at the end
                //"Add 3".split(" ") -> ["Add", "3"]
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Insert")) {
                //•	"Insert {number} {index}" - insert number at given index
                //"Insert 10 2".split(" ") -> ["Insert", "10", "2"]
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);

                //проверка дали съществува индекса в списъка (index)
                //{3, 4, 5, 9 , 12} -> [0; size - 1]
                if(isValidIndex(index, numbers)) {
                    //валиден индекс
                    numbers.add(index, numberToInsert);
                } else  {
                    //невалиден индекс
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                //•	"Remove {index}" - remove that index
                //"Remove 2".split(" ") -> ["Remove", "2"]
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]);

                //проверка дали съществува индекса в списъка (indexForRemove)
                //{3, 4, 5, 9 , 12} -> [0; size - 1]
                if (isValidIndex(indexForRemove, numbers)) {
                    //валиден индекс
                    numbers.remove(indexForRemove);
                } else {
                    //невалиден индекс
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                //•	"Shift left {count}" - first number becomes last 'count' times
                //"Shift left 2".split(" ") -> ["Shift", "left", "2"]
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                //повтаряме нещо -> countShiftLeft пъти
                for (int time = 1; time <= countShiftLeft; time++) {
                    //first number becomes last
                    //{3, 4, 6, 7, 1}
                    //1. взимам първото число от списъка -> index = 0
                    int firstNumber = numbers.get(0);
                    //2. премахвам по индекс първото число от списъка -> {4, 6, 7, 1}
                    numbers.remove(0);
                    //3. добавям го накрая на списъка -> {4, 6, 7, 1, 3}
                    numbers.add(firstNumber);
                }
            } else if (command.contains("Shift right")) {
                //•	"Shift right {count}" - last number becomes first 'count' times
                //"Shift right 3".split(" ") -> ["Shift", "right", "3"]
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                //повтаряме дейност -> countShiftRight пъти
                for (int time = 1; time <= countShiftRight; time++) {
                    //last number becomes first
                    //{3, 4, 6, 7, 1}
                    //1. взимам последното число от списъка -> index = size - 1
                    int lastNumber = numbers.get(numbers.size() - 1);
                    //2. премахвам последното число от списъка -> {3, 4, 6, 7}
                    numbers.remove(numbers.size() - 1);
                    //3. добавям го в началото на списъка -> {1, 3, 4, 6, 7}
                    numbers.add(0,lastNumber);
                }
            }
            command = scanner.nextLine();
        }

        //крайния списък с числа
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    //метод, който проверява дали даден индекс е валиден
    //true -> валиден индекс -> [0, size - 1]
    //false -> невалиден индекс
    public static boolean isValidIndex (int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
