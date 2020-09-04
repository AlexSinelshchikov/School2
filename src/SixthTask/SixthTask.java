package SixthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите целое число");
        int number  = Integer.parseInt(reader.readLine());

        propertyNumber(number);
    }

    public static void propertyNumber (int number ) {

        if (number == 0) {
            System.out.println("Значение является нулевым числом.");
        }
        else if (number > 0 && number % 2 == 0) {
            System.out.println("Четное, положительное значение.");
        }
            else if (number > 0 && number % 2 != 0) {
            System.out.println("Нечетное, положительное значение.");
        }
            else if (number < 0 && number % 2 == 0 ) {
            System.out.println("Четное, отрицательное значение.");
        }
            else if (number < 0 && number % 2 != 0) {
            System.out.println("Нечетное, отрицательное значение");
        }
    }
}
