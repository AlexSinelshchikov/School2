package EighthTask;

import java.util.ArrayList;
import java.util.Collections;

public class EighthTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-10);
        list.add(5);
        list.add(6);
        list.add(45);
        list.add(23);
        list.add(-45);
        list.add(-34);
        list.add(0);
        list.add(32);
        list.add(56);
        list.add(-1);
        list.add(2);
        list.add(-2);

        System.out.println("Максимальное значение:" + " " + Collections.max(list));
        positiveSum(list);
        sumEvenNegative(list);
        quantityPositive(list);
        averageArithmetic(list);
    }

    public static void positiveSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer > 0) {
                sum += integer;
            }
        }
        System.out.println("Сумма положительных элементов массива:" + " " + sum);
    }

    public static void sumEvenNegative(ArrayList<Integer> list) {
        int sum = 0;
        for (int tmpInt : list) {
            if (tmpInt % 2 == 0 && tmpInt < 0) {
                sum += tmpInt;
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива:" + " " + sum);
    }

    public static void quantityPositive(ArrayList<Integer> list) {
        int sumQuantity = 0;
        for (int quantity : list) {
            if (quantity > 0) {
                sumQuantity++;
            }
        }

        System.out.println("Количество положительных элементов массива:" + " " + sumQuantity);
    }

    public static void averageArithmetic(ArrayList<Integer> list) {
        double sumNumber = 0;
        double sumAll = 0;
        for (int temp : list) {
            if (temp < 0) {
                sumAll += temp;
                sumNumber++;
            }
        }
        double arithmetic = sumAll / sumNumber;
        System.out.println("Среднее арифметическое отрицательных элементов:" + " " + arithmetic);
    }
}





