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

        System.out.println("\n2 Задание.\n");

        int min = arr[0];
        int max = arr[0];
        for (int i: arr){
           if(min > i) {
               min = i;
           }
           if(max < i){
               max = i;
           }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("\n3 Задание.\n");

        float mean = (float) sum / 5;
        System.out.println(mean);

        System.out.println("\n4 Задание.\n");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        //если имеется в виду лишь корректный вывод
        System.out.println("1-ое решение:\n");
        for(int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

        //если имеется в виду поменять порядок элементов в массиве
        System.out.println("\n\n2-ое решение:\n");
        char c;
        for (int i = 0; i < reverseFullName.length/2; i++){
            c = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = c;
        }
        for (int i = 0; i < reverseFullName.length; i++){
            System.out.print(reverseFullName[i]);
        }
    }
}