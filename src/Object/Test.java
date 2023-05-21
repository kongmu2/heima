package Object;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("杨泉城", 9);
        User user2 = new User("杨泉城", 9);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());


        System.out.println(user1.equals(user2));
    }
}
