package fanxing.Genextends;

public class Person<T> {
    private T t;

    public static void show(Person<? extends Number> person){
        System.out.println(person.getT());
    }

    public static void show2(Person<? super String > person){
        System.out.println(person.getT());
    }

    public Person(T t) {
        this.t = t;
    }

    public Person() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Person{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {
        Person<Integer> integerPerson = new Person<>(new Integer(100));
        show(integerPerson);
        Person<String> yqc = new Person<>(new String("yqc"));
//        show(yqc);//上限
        show2(yqc);
        Person<Object> objectPerson = new Person<>(new Object());
        objectPerson.setT("yqcasdas");
        show2(objectPerson);
    }
}
