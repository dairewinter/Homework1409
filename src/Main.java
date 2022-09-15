import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        generateRandomArray();



    }

    int[] arr = generateRandomArray();

    //Задание 1
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Максимальная сумма затрат за день составила " + maxArr + " рублей");
        System.out.println("Минимальная сумма затрат за день составила " + minArr + " рублей");

        //Задание 3
        float arrAverage = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + arrAverage);

        return arr;
    }

    //Задание 4

    public static void Reverse(String[] args) {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = 0; i < reverseFullName.length; i++) {

        }
        for (char i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (char i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}