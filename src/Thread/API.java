package Thread;

public class API {

        public static void main(String[] args) {
            Thread t=new mythreadt();
            t.start();
            t.setName("线程1");

            Thread t1=new mythreadt();
            t1.start();

            //当前线程对象     
//            Thread m=new Thread.currentThread();
//            System.out.println(m.getName());

            for (int i = 0; i < 5; i++) {
                System.out.println("main线程输出"+i);
            }
        }
}
class mythreadt extends Thread{
    @Override
    public void run() {

        for (int i=0;i<=4;i++) {
            System.out.println("子线程"+i);
        }
    }
}
