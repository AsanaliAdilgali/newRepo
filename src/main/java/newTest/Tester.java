package newTest;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число массивов:");
        int a = scanner.nextInt();

        int[] num = new int[a];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < a; i++ ){
            num[i] = scanner.nextInt();
        }
        System.out.println("Результат любых двух элементов:");
        int target = scanner.nextInt();
        Decision dec = new Decision();
        int[] result = dec.twoNum(num, target);
        System.out.println("[" + result[0] + " " + result[ 1 ] + "]");



    }
}
