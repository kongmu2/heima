package method;

public class Worker {
    private String name;
    private int age;
    private double salary;
    private Address addr;

    public Worker() {
    }


    public Worker(String name, int age, double salary, Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    @Override
    public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", addr=" + addr.getAddress()+",zipcode="+addr.getZipCode()+
                    '}';
    }

    public static void main(String[] args) {
        Address add=new Address("北京市海淀区清华园1 号",100084);
        Worker worker=new Worker("zhangsan",25,2500,add);
        System.out.println(worker);
    }
}
