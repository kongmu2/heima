package collection.list.stack;

import org.junit.Test;

import java.util.Stack;

public class teststack {
    @Test
    public void teststack(){
        Stack<String> stack = new Stack<>();
        stack.push("张荣浩");
        stack.push("杨泉城");
        stack.push("lib");
        stack.push("dsad");
        stack.push("食道癌");
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());//查看栈顶元素
        System.out.println("stack.search(\"张荣浩\") = " + stack.search("张荣浩"));
    }
}
