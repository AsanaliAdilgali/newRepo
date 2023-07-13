package practice;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите числа первого массива:");
//        int first = scanner.nextInt();
//        int[] minMas = new int[first];
//
//        System.out.println("Введите числа второго массива");
//        int second = scanner.nextInt();
//        int[] minSecondMas = new int[second];


//        System.out.println("Наименьшие элементы массивов: " + "[" + min + " " + min2 + "]");

        int[] arr1 = new int[]{2, 5, 7};
        int[] arr2 = new int[]{1, 8, 3};
        for (int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (a == arr2[j]) {
                    System.out.println(a);
                }
            }
        }
    }
}


