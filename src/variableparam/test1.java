package variableparam;


public class test1 {
    public int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public String sum(int a,int b){
        String sum="AA";
        sum=sum+a+b;
        return sum;
    }
    public static void main(String[] args) {
        test1 test1 = new test1();
        System.out.println(test1.sum(3, 5));//同时有可变参数和定参数时优先调用定参数的方法
        System.out.println(test1.sum(3, 5, 7));
    }
}
