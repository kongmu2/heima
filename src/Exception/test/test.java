package Exception.test;

public class test {
    public static void main(String[] args) {
        Employee employee=new Employee();
        try {
            employee.setSalary(1200);
        } catch (customex customex) {
            customex.printStackTrace();
        }
        System.out.println("finish");
    }
}
