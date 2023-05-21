package suanfa.ArrayQueue;

import java.util.Scanner;

public class ArrayCircleQueue {
    public static void main(String[] args) {
        System.out.println("环形队列");
        CircleQueue queue = new CircleQueue(4);
        char key=' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop =true;
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据");
            System.out.println("g(get):取出数据");
            System.out.println("h(head):查看队列头数据");
            key=scanner.next().charAt(0);
            switch (key){
                case 's':
                    queue.show();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value=scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res=queue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res =queue.headQueue();
                        System.out.printf("取出的头数据是%d\n",res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }

    }

}
class CircleQueue {
    private int maxSize;//数组最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//存放数据

    //创建队列的构造器
    public CircleQueue(int arrMaxsize) {
        maxSize = arrMaxsize+1;
        arr = new int[maxSize];
        front=0;
        rear=0;
    }

    //判断队列是否已满
    public boolean isFull() {
        return (rear+1)%maxSize == front;
    }


    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已满不能加入数据");
            return;
        }
        arr[rear] = n;
        //rear后移
        rear=(rear+1)%maxSize;
    }

    //从队列取数据
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空不能取数据");
        }
        //先把front的值保存到一个临时变量
        //将front后移s
        int value=arr[front];
        front=(front+1)%maxSize;
        return value;
    }

    //展示队列
    public void show() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        //从front开始遍历
        for (int i = front; i < front+size(); i++) {
            System.out.printf("arr[%d]=%d\n", i%maxSize, arr[i%maxSize]);
        }
    }

    //显示头数据
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }

    //求出队列有效数据
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }
}