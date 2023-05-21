package fanxing;

public class testmethod {
    public static void main(String[] args) {
        show(new Integer[]{1,2,3});
        show(new String[]{"1","sad","daw"});
        show(new User[]{
                new User("yqc",2),
                new User("sdak",4)
        });
    }
    //泛型方法在返回值类型前加泛型类型
    public static <E> void show(E[] arr){
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
