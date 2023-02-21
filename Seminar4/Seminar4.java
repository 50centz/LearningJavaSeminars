package Seminars.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Seminar4
 */
public class Seminar4 {

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        // 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        // 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
            
        }
        
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            ll.add(i);            
        }


        System.out.println(System.currentTimeMillis() - timeStart);



    }
}