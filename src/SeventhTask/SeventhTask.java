package SeventhTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class SeventhTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> guide = new HashMap<Integer, String>();
        guide.put(905, "Москва. Стоимость разговора: 4.15 руб.");
        guide.put(194, "Ростов. Стоимость разговора: 1,98 руб.");
        guide.put(491, "Краснодар. Стоимость разговора: 2,69 руб.");
        guide.put(800, "Киров. Стоимость разговора: 5,00 руб");

        System.out.println("Введите код города");
        int areaCode = Integer.parseInt(reader.readLine());

        if (guide.get(areaCode) == null) {
            System.out.println("Данного кода нет в базе, введите корректный код.");
        } else System.out.println(guide.get(areaCode));
    }
}




