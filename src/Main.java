import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 Задание.\n");

        int[] arr = new int[5];
        arr[0] = 1_234;
        arr[1] = 3_567;
        arr[2] = 4_987;
        arr[3] = 4_003;
        arr[4] = 4_673;
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("\n2 Задание\n");

    }
}