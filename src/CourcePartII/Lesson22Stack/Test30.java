package CourcePartII.Lesson22Stack;

import java.util.Stack;

public class Test30 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); //class synchronized
        stack.push("Alex");
        stack.push("Alina");
        stack.push("Maxim");
        stack.push("Svetlana");
        System.out.println(stack);//[Alex, Alina, Maxim, Svetlana]
        System.out.println(stack.pop());//Svetlana
        System.out.println(stack);//[Alex, Alina, Maxim]
        while (!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack);
        }
        System.out.println("*************");
        Stack<String> stack2 = new Stack<>();
        stack2.push("Alex");
        stack2.push("Alina");
        stack2.push("Maxim");
        stack2.push("Svetlana");

        System.out.println(stack2.peek());//Svetlana
        System.out.println(stack2);//[Alex, Alina, Maxim, Svetlana]

    }

}
