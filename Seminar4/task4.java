package Seminars.Seminar4;

public class task4 {
    public static void main(String[] args) {
        // Реализовать стэк с помощью массива. 
        // Нужно реализовать методы:
        // size(), empty(), push(), peek(), pop().
        MyStack stack = new MyStack();
        System.out.println(stack.size());
        stack.push(5);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
