package findTheLongestCommon;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String[] strs = new String[3];
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите несколько слов:");
            String str = scanner.nextLine();
            strs[i] = str;
        }
        Tester tester = new Tester();
        String result = tester.longestStr(strs);
        System.out.println(result);
    }

        public String longestStr(String[] s) {
            int size = s.length;
            if (size == 0) {
                return "";
            }
            if (size == 1) {
                return s[0];
            }
            Arrays.sort(s);
            int end = Math.min(s[0].length(), s[size - 1].length());
            int i = 0;
            while (i < end && s[0].charAt(i) == s[size - 1].charAt(i))
                i++;

            String delete = s[0].substring(0, i);
            return delete;
        }
    }




