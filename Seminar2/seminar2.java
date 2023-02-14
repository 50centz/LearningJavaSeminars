package Seminars.Seminar2;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.w3c.dom.Text;
/**
 * seminar2
 */
public class seminar2 {

    public static void main(String[] args) {
        // Дано четное число N (>0) и символы c1 и c2. 
        // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

        // String s1 = "c1";
        // String s2 = "c2";
        // StringBuilder s3 = new StringBuilder();
        // int N = 10;
        // while (s3.length() <= N/2) {
        //     s3.append(s1);
        //     s3.append(s2);
        // }
        // if (s3.length() < N)
        //     s3.append(s1);
        // System.out.println(s3);

        // Напишите метод, который сжимает строку. 
        // Пример: вход aaaabbbcdd.

        // String s3 = "aaaabbbcddf";
        // StringBuilder s2 = new StringBuilder();
        // int count = 1;
        // for(int i = 1; i < s1.length(); i++) {
        //     var temp = s1.charAt(i-1);
        //     if (temp == s1.charAt(i)) {
        //         count++;
        //     }
        //     else {
        //         s2.append(count);
        //         s2.append(temp);
        //         count = 1;
        //     }
        //     if(i == s1.length() - 1) {
        //         s2.append(count);
        //         s2.append(s1.charAt(i));
        //     }
        // }
        // System.out.println(s2);

        // Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

        // Scanner reader = new Scanner(System.in);
        // System.out.print("Введите слово: ");
        // String pl = reader.nextLine();
        // reader.close();
        // boolean flag = false;
        // StringBuilder plp = new StringBuilder(pl); 
        // plp.reverse();
        // String pl1 = new String(plp);
        // System.out.println(plp);
        // if(pl.equals(pl1)){
        //     flag = true;
        // }
        // System.out.println(flag);



        // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            test.append("TEST ");
            
        }
        // System.out.println(test);
        try (FileWriter mywriter = new FileWriter("file.txt")){
            mywriter.write(String.valueOf(test));
        } catch (Exception e){
            System.out.println("Ошибка");
        }
        finally{
            System.out.println("Конец работы с фалом");
        }

        // Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
        // Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
        // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
    }
}