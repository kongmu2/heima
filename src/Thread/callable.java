package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class callable {
    public static void main(String[] args) {
        //创建callable任务对象
        Callable<String> call=new Mycallable(40);
        //把任务类给FutureTask
        //FutureTask可以交给Thread 还可以在线程完成后调用get方法获得线程结果
        FutureTask<String> future=new FutureTask<>(call);
        Thread thread1=new Thread(future);
        thread1.start();

        try {
            String r1=future.get();
            System.out.println("第一个结果"+r1);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Callable<String> call1=new Mycallable(100);
        FutureTask<String> future1=new FutureTask<>(call1);
        Thread thread2=new Thread(future1);
        thread2.start();

        try {
            String r2=future1.get();
            System.out.println("第二个结果"+r2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Mycallable implements Callable<String> {
    private int n;
    public Mycallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum +=1;
        }
        return "线程结果"+sum;
    }
}