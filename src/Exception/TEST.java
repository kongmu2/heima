package Exception;

public class TEST {
    public static void main(String[] args) {
        int n=1;
        try {

            m(n);
        }catch (MyException1 ex1){
            ex1.printStackTrace();
            System.out.println("ex1.getMessage() = " + ex1.getMessage());
        }
        catch (MyException2 ex2){
            System.out.println("ex2.getMessage() = " + ex2.getMessage());
            throw ex2;
        }
        finally {
            System.out.println("finaly");
        }

    }
    public static void m(int n) throws MyException1{
        if (n==1){
            throw new MyException1("n=1");
        }else {
            throw new MyException2("n=2");
        }
    }
}
