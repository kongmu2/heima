package fanxing;

public class interfaceim2<T> implements testinterface<T>{
    @Override
    public T getT(T t) {
        return t;
    }

    @Override
    public String getString(T t) {
        return String.valueOf(t);
    }

    public static void main(String[] args) {
        interfaceim2<Integer> interger = new interfaceim2<>();
        System.out.println(interger.getT(12));
        System.out.println(interger.getString(232));

        interfaceim2<String> string = new interfaceim2<>();
        System.out.println(string.getT("dskjadk"));
        System.out.println(string.getString("yqc"));

        interfaceim2<User> user = new interfaceim2<>();
        System.out.println(user.getString(new User("yqc", 9)));
        System.out.println(user.getT(new User("yqc", 9)));
    }
}
