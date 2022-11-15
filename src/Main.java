import java.util.Arrays;
import java.lang.*;


public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("Сумма всех выплат за месяц составила: " + sum + " рублей.");
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (min > num) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Минимальная сумма трат составила: " + min + " рублей");
        System.out.println("Максимальная сумма трат составила: " + max + " рублей");
        float average;
        average = sum / 30f;
        System.out.println("Cредняя сумма затрат за месяц составила: " + average + " рублей");

    }
    static class ReverseString {
        public static void main(String[] args) {
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int o = reverseFullName.length - 1; o >= 0; o--)
                System.out.print(reverseFullName[o]);
        }
    }
}
