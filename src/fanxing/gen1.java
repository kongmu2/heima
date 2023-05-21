package fanxing;
//泛型类在创建对象时指定对象类型
public class gen1<T> {
    private T obj;

    public void showType(){
        System.out.println(this.obj.getClass().getName());
    }

    public gen1() {
    }

    public gen1(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }


    public static void main(String[] args) {
        gen1<Integer> gen1 = new gen1<Integer>(new Integer(100));
        gen1.showType();

        gen1<String > gen2 = new gen1<>(new String("strss"));
        gen2.showType();

        Integer s= (Integer) gen1.getObj();
    }

}
