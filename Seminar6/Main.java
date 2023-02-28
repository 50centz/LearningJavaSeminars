package Seminars.Seminar6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat.name = "Барсик";
        cat.color = "Рыжий";
        cat.dateOfBirth = LocalDate.of(2018, 1, 20);

        Cat cat1 = new Cat();
        cat1.name = "Васька";
        cat1.color = "Чёрный";
        cat1.dateOfBirth = LocalDate.of(2015, 1, 20);

        System.out.println(cat);
        System.out.println(cat1);
    }
}
