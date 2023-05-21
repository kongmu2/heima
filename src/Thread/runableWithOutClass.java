package Thread;
import java.lang.Thread;
public class runableWithOutClass {
    public static void main(String[] args) {
        Runnable ru=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=4;i++) {
                    System.out.println("子线程"+i);
                }
            }
        };
        Thread s=new Thread(ru);
        s.start();
        for (int i=0;i<=4;i++) {
            System.out.println("主线程"+i);
        }
    }
}
