package Seminars.Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Seminar6
 */
public class Seminar6 {

    public static void main(String[] args) {
    // 1. Создайте HashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}. Распечатайте содержимое данного множества.
    // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.  Распечатайте содержимое данного множества.
    // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 0, 3}.  Распечатайте содержимое данного множества.

        HashSet <Integer> set = new HashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        Set <Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 6, 2, 4, 5, 0, 3));
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);





        // 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
        // 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в 
        // виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

        Integer[] arr = getArray(0, 25, 1000);
        Double unic = unicValuse(arr);
        System.out.println(unic);
    }

    public static Integer[] getArray(int min, int max, int size){
        Integer[] array = new Integer[size];
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(min, max);
        }

        return array;
    }

    public static Double unicValuse(Integer[] array){

        HashSet <Integer> set = new HashSet<>(Arrays.asList(array));
        Double unVal = set.size() * 100.0 / array.length;

        return unVal;
    }
}