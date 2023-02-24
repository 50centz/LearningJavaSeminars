package LearningJavaSeminars.Seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/**
 * Seminar5
 */
public class Seminar5 {

    public static void main(String[] args) {
        // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        // 123456 Иванов
        // 321456 Васильев
        // 234561 Петрова
        // 234432 Иванов
        // 654321 Петрова
        // 345678 Иванов
        // Вывести данные по сотрудникам с фамилией Иванов.
















        // Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        // повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
        // буква может не меняться, а остаться такой же. (Например, note - code)
        // Пример 1:
        // Input: s = "foo", t = "bar"
        // Output: false
        // Пример 2:
        // Input: s = "paper", t = "title"
        // Output: true
        





        // Написать программу, определяющую правильность расстановки скобок в выражении.
        // Пример 1: a+(d*3) - истина
        // Пример 2: [a+(1*3) - ложь
        // Пример 3: [6+(3*3)] - истина
        // Пример 4: {a}[+]{(d*3)} - истина
        // Пример 5: <{a}+{(d*3)}> - истина
        // Пример 6: {a+]}{(d*3)} - ложь




        // Взять набор строк, например,
        // Мороз и солнце день чудесный
        // Еще ты дремлешь друг прелестный
        // Еще ты дремлешь друг прелестный 
        // Пора красавица проснись.
        // Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.

        String s = "Мороз и солнце день чудесный\nЕще ты дремлешь друг прелестный\nЕще ты дремлешь друг прелестный\nПора красавица проснись.";
        System.out.println(ex1(s));

    }

    public static boolean ex0(String s){
        // Map<Character, Character> map = new HashMap<>();
        // map.put('(', ')');
        // char[] chars = s.toCharArray();

        // Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < chars.length; i++) {
        //     if (chars[i] == '('){
        //         stack.push((chars[i]));
        //     }
        //     if(chars[i] == ')'){
        //         if(stack.isEmpty() || stack.pop() != '('){
        //             return false;
        //         }
        //     }
            
        // }
        // return stack.isEmpty();


        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                stack.push(chars[i]);
            }
            if (map.containsValue(chars[i])){
                if (stack.isEmpty() || chars[i] != map.get(stack.pop())){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean ex1(String s){
        Map<Integer, List<String>> treeMap = new TreeMap<>();  //Collections.reversOrder()
        String[] s1 = s.split("\n");

        for (String s2 : s1) {
            if (treeMap.containsKey(s2.length())){
                List<String> list = treeMap.get(s2.length());
                list.add(s2);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s2);
                treeMap.put(s2.length(), list);
            }
            
        }
        System.out.println(treeMap);
        return true;
    }

    
}