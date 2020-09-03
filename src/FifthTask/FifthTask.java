package FifthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        int first = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число");
        int second = Integer.parseInt(reader.readLine());

        System.out.println("Введите третье число");
        int third = Integer.parseInt(reader.readLine());

        minNumber (first, second, third);
    }
        public static void minNumber (int first, int second, int third) {
            int[] list = {first, second, third};
            Arrays.sort(list);

            int value = list[0];

            System.out.println(value);
    }
}
