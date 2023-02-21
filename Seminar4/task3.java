package Seminars.Seminar4;

import java.util.LinkedList;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        // 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        // 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
        int[] array = createArray();
        showStack(addToStack(array));
        showLinkedList(addToQueue(array));
    }

    public static Stack<Integer> addToStack(int[] array){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        return stack;
    }

    public static void showStack(Stack<Integer> stack){
        // for (Integer item : stack) {
        //     System.out.print(item + " ");
        // }

        // for (int i = 0; i < stack.size(); i++) {
        //     System.out.print(stack.pop() + " ");
        // }
        while(stack.size() > 0){
            System.out.print(stack.pop() + " ");
        }
    }

    public static int[] createArray(){
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;
        }

        return myIntArr;
    }

    public static LinkedList<Integer> addToQueue(int[] array){
        LinkedList<Integer> ll = new LinkedList<>();

        for (int item: array) {
            ll.addLast(item);
        }
        return ll;
    }

    
    public static void showLinkedList(LinkedList<Integer> linkedList){
        for (Integer item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println(linkedList);
        // for (int i = 0; i < stack.size(); i++) {
        //     System.out.print(stack.pop() + " ");
        // }
        while(linkedList.size() > 0){
            System.out.print(linkedList.pop() + " ");
        }
    }
}
