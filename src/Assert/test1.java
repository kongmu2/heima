package Assert;

public class test1 {
    public static void main(String[] args) {
        int i=1;
        assert i!=1:"断言错误";
        System.out.println("i = " + i);
    }
}
