package task2;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение или слово: ");
        String str = scanner.nextLine();

        String[] theLastWord = str.split(" ");
        String str1 = theLastWord[theLastWord.length - 1];
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
