package FourthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        while (true) {

            if (number > 0) {
                ++number;
                System.out.println(number);
                break;
            } else if (number == 0) {
                number = 10;
                System.out.println(number);
                break;
            } else if (number < 0) {
                number -= 2;
                System.out.println(number);
                break;
            }
        }
    }
}














