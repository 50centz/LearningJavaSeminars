package Seminars.Seminar3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Seminar3 {
    public static void main(String[] args) {
        
        // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        if (s1.equals(s6)){
            System.out.println("Равны");
        }

        Random random = new Random();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(0, 40));
        } 
        list1.add(random.nextInt(20, 40));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
        
        
        // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
        // Вывести название каждой планеты и количество его повторений в списке.


        // Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Юпитер", "Марс", "Венера", "Земля", "Меркуррий", "Меркуррий",
                                                    "Нептун","Плутон", "Сатурн", "Сатурн","Уран", "Уран", "Уран"));

        // list2.add("Марс");
        // list2.add("Венера");
        // list2.add("Юпитер");
        // list2.add("Земля");
        // list2.add("Меркуррий");
        // list2.add("Нептун");
        // list2.add("Плутон");
        // list2.add("Сатурн");
        // list2.add("Уран");
        int count = 1;
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            count = 1;
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(i).equals(list2.get(j))){
                    list2.remove(j);
                    j--;
                    count += 1;
                }
                
            }
            System.out.printf("Планета %s повторяется %d раз\n", list2.get(i), count);
        }
        System.out.println(list2);


    }
}
