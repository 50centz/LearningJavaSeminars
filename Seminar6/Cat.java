package Seminars.Seminar6;

import java.time.LocalDate;

/*
Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

/* 
Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
*/

public class Cat {
    String name;
    String color;
    LocalDate dateOfBirth;

    Cat(){
        name = "default";
        color = "red";
        dateOfBirth = LocalDate.of(2018, 1, 20);
    }

    public Cat(String name, String color, LocalDate dateOfBirth){
        this.name = name;
        this.color = color.toLowerCase();
        this.dateOfBirth = dateOfBirth;
    }

    int getAge(){
        LocalDate date = LocalDate.now();
        int res = date.getYear() - dateOfBirth.getYear();
        return res;
    }

    @Override
    public String toString() {
        
        return name + " цвета: " + color + " возраст " + getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Cat)){
            return false;
        }

        Cat cat = (Cat) obj;
        if(this.name.equals(cat.name) && this.color.equals(cat.color) && this.dateOfBirth.equals(cat.dateOfBirth)){
            return true;
        }{
            return false;
        }
        
    }

    @Override
    public int hashCode() {
    
        return name.hashCode() + 7*color.hashCode() + 13*dateOfBirth.hashCode();
    }
}
