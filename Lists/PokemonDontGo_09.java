package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. списък с числа -> входни данни
        List<Integer> numbers = Arrays.stream(scanner.nextLine() //"4 5 3"
                               .split("\\s+")) //["4", "5", "3"]
                                .map(Integer::parseInt) //[4, 5, 3]
                                .collect(Collectors.toList()); // {4, 5, 3}

        int sumRemoved = 0; // сума на премахнатите елементи

        //повтаряме: въвеждаме индекс (цяло число)
        //стоп: списъка стане празен -> size <= 0
        //продължаваме: списъка е пълен -> size > 0
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            //1. index в списъка -> >= 0 и <= последния
            if (index >= 0 && index <= numbers.size() - 1) {
                //1. взимам елемента на дадения индекс
                int removedElement = numbers.get(index); //премахнат елемент
                //2. премахвам елемента от този индекс -> сумирам елемента
                sumRemoved += removedElement;
                numbers.remove(index);
                //3. модифицирам списъка спрямо премахнатото число
                //{3, 4, 8, 9, 12}
                modifyList(numbers, removedElement);
            }
            //2. index < 0
            else if (index < 0) {
                //1. взимаме първия елемент от списъка
                int firstElement = numbers.get(0); //премахнатия елемент
                //2. премахвам първия елемент от списъка -> сумирам елемента
                sumRemoved += firstElement;
                numbers.remove(0);
                //3. взимаме последния елемент от списъка
                int lastElement = numbers.get(numbers.size() - 1);
                //4. слагаме на index -> последния елемент
                numbers.add(0, lastElement);
                //5. модифицирам списъка спрямо премахнатия елемент
                //{3, 4, 8, 9, 12}
                modifyList(numbers, firstElement);
            }
            //3. index > последния
            else if (index > numbers.size() - 1) {
                //1. взимаме последния елемент
                int lastElement = numbers.get(numbers.size() - 1); //премахнатия елемент
                //2. премахваме последния елемент -> сумираме премахнатия елемент
                sumRemoved += lastElement;
                numbers.remove(numbers.size() - 1);
                //3. взимаме първия елемент
                int firstElement = numbers.get(0);
                //4. слагаме първия елемент като последен
                numbers.add(firstElement); //добавяме firstElement на края на списъка
                //5. модифицирам списъка -> премахнатия елемент (lastElement)
                modifyList(numbers, lastElement);

            }

        }

        System.out.println(sumRemoved);

    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
            int currentNumber = numbers.get(indexInList);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            numbers.set(indexInList, currentNumber);
        }
    }
}
