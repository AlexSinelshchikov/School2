package SeventhTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeventhTask {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double cityMoscow = 4.15;
        double cityRostov = 1.98;
        double cityKrasnodar = 2.69;
        double cityKirov = 5.00;

        System.out.println("Введите код города");
        int areaCode = Integer.parseInt(reader.readLine());


        switch (areaCode) {
            case 905 -> System.out.println("Москва. Стоимость одной минуты разговора: 4.15 руб." + " Стоимость разговора десяти минут составит:" + " " + costOfTenMinutesConversationMoscow(cityMoscow) + " руб.");
            case 194 -> System.out.println("Ростов. Стоимость одной минуты разговора: 1.98 руб." + " Стоимость разговора десяти минут составит:" + " " + costOfTenMinutesConversationRostov(cityRostov) + " руб.");
            case 491 -> System.out.println("Краснодар. Стоимость разговора: 2.69 руб." + " Стоимость разговора десяти минут составит:" + " " + costOfTenMinutesConversationKrasnodar(cityKrasnodar) + " руб.");
            case 800 -> System.out.println("Киров. Стоимость разговора: 5.00 руб" + " Стоимость разговора десяти минут составит:" + " " + costOfTenMinutesConversationKirov(cityKirov) + " руб.");
        }
    }

    public static double costOfTenMinutesConversationMoscow(double cityMoscow) {
        return cityMoscow * 10;
    }

    public static double costOfTenMinutesConversationRostov(double cityRostov) {
        return cityRostov * 10;
    }

    public static double costOfTenMinutesConversationKrasnodar(double cityKrasnodar) {
        return cityKrasnodar * 10;
    }

    public static double costOfTenMinutesConversationKirov(double cityKirov) {
        return cityKirov * 10;
    }
}


            







