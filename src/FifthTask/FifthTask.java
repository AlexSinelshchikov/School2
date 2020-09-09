package FifthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FifthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int d = 1; d <= 1; d++) {
            System.out.println("Введите первое число");
            int first = Integer.parseInt(reader.readLine());

            System.out.println("Введите второе число");
            int second = Integer.parseInt(reader.readLine());

            System.out.println("Введите третье число");
            int third = Integer.parseInt(reader.readLine());

            int least;
            if (first < second && first < third) {
                least = first;
            } else least = Math.min(second, third);

            System.out.println("Минимальное значение:" + " " + least);
        }
    }
}


