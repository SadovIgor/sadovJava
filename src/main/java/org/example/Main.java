package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        getEvenNumbers();

        compareStrings("sfdgasgfs", "sfdgasgfs");

        makeMathOperationWith(8, 2);

    }

    /**
     * Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
     * необходимо написать программу, которая выведет в консоль все чётные числа.
     */
    public static void getEvenNumbers() {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Выводим в кансоль только четные числа из массива " + Arrays.toString(values));
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println(values[i]);
            }
        }
    }

    /**
     * Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
     * В результате сравнения в консоль должно быть выведено одно из сообщений:
     * "Строки неидентичны" или "Строки идентичны"
     */
    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    /**
     * Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
     * - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
     * - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
     */
    public static void makeMathOperationWith(int numb1, int numb2) {
        if (numb1 > numb2) {
            System.out.println(numb1 + " > " + numb2);
        } else if (numb1 < numb2) {
            System.out.println(numb1 + " < " + numb2);
        } else {
            System.out.println(numb1 + " = " + numb2);
        }
        System.out.println(numb1 + " + " + numb2 + " = " + (numb1 + numb2));
        System.out.println(numb1 + " - " + numb2 + " = " + (numb1 - numb2));
        System.out.println(numb1 + " * " + numb2 + " = " + (numb1 * numb2));
        System.out.println(numb1 + " / " + numb2 + " = " + (numb1 / numb2));
    }
}