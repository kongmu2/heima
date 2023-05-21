package suanfa.Stack;

import java.util.Scanner;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        String key="";
        boolean loop=true;
        Scanner scanner = new Scanner(System.in);
        while (loop){
            System.out.println("show：表示显示栈");
            System.out.println("exit：退出程序");
            System.out.println("push：添加数据到栈");
            System.out.println("pop：数据出栈");
            System.out.println("请输入选择");
            key=scanner.next();
            switch (key){
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int value=scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int res=stack.pop();
                        System.out.printf("出栈数据为%d\n",res);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }

        }
    }
}

class ArrayStack{
    private int maxSize;
    private int[] stack;
    private int top=-1;

    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }

    //判断是否已满
    public boolean isFull(){
        return top==maxSize-1;
    }
    //判断栈空
    public boolean isEmpty(){
        return top ==-1;
    }

    //入栈
    public void push(int value){
        if (isFull()){
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top]=value;
    }

    //出栈
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空没有数据");
        }
        int value=stack[top];
        top--;
        return value;
    }

    //展示栈的情况
    public void list(){
        if (isEmpty()){
            System.out.println("栈空没有数据");
            return;
        }
        for (int i = top; i>=0; i--) {
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

}
