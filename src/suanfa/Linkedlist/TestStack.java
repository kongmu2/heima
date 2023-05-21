package suanfa.Linkedlist;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("tom");
        stack.add("jack");
        stack.add("lu");

        while (stack.size()>0){
            System.out.println(stack.pop());
        }

    }
}
