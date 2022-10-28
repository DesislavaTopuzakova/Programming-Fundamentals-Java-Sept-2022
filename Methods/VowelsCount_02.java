package methods;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> текст
        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);

        //"DeSiSlava".toLowerCase() -> "desislava"
        //"desislava".toUpperCase() -> "DESISLAVA"
    }
    //метод, който принтира броя на гласните букви
    public static void printVowelsCount (String text) {
        //!!! text е изцяло с малки букви
        //text = "Desislava" -> ['D', 'e', 's', 'i', ...] -> 4
        int count = 0; //брой на гласните букви
        for (char symbol : text.toCharArray()) {
            //проверка дали е гласна буква -> a, e, i, o, u
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                //гласна буква
                count++;
            }
        }
        System.out.println(count);
    }
}
