package Thread;

public class thread {
    public static void main(String[] args) {
        Thread t=new mythread();
        t.start();
        for (int i=0;i<=4;i++) {
            System.out.println("主线程"+i);
        }
    }
}

class mythread extends Thread{
    @Override
    public void run() {

        for (int i=0;i<=4;i++) {
            System.out.println("子线程"+i);
        }
    }
}