package Exception;

public class D {
    public void d(int a,int b) throws Exception {
        if (b==0){
            throw new Exception();
        }
        System.out.println(a/b);
    }
}
