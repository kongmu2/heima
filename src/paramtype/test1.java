package paramtype;

public class test1 {
    public void add(int x){
        x++;
        System.out.println("test1.add([x])方法"+x);
    }

    public static void main(String[] args) {
        int x=100;
        test1 test1 = new test1();
        test1.add(x);
        System.out.println(x);
    }
}
