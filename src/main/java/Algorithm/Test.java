package Algorithm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = scanner.nextLine();
        Test test = new Test();
        System.out.println(test.isPalindrome(str));
    }

    public boolean isPalindrome(String str){
        boolean isPalindrome = false;

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                System.out.println("It is not palindrome");
                return isPalindrome;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("It is Palindrome");
        isPalindrome = true;
        return isPalindrome;
    }
}

