package Thread;

public class runnable {
    public static void main(String[] args) {

        Runnable ru=new myrunnable();
        Thread t=new Thread(ru);

        t.start();

        for (int i=0;i<=4;i++) {
            System.out.println("主线程"+i);
        }
    }

}
class myrunnable implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<=4;i++) {
            System.out.println("子线程"+i);
        }
    }
}