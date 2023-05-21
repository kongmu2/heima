package Lambda.l8;

public class OutClass {
    public static void main(String[] args) {
        A a=User::new;
        User user= a.createUser("杨泉城",22);
        System.out.println("user.getName() = " + user.getName());
        System.out.println("user.getAge() = " + user.getAge());
    }
}
