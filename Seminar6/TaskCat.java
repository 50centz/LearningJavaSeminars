package Seminars.Seminar6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/* 
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, 
только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
*/

public class TaskCat {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Cat cat1 = new Cat("Барски", "Рыжий", LocalDate.of(2018, 1, 20));
        Cat cat2 = new Cat("Барски", "Рыжий", LocalDate.of(2018, 1, 20));
        Cat cat3 = new Cat("Барски", "Рыжий", LocalDate.of(2018, 1, 20));

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        System.out.println(set);
        
    }
}
