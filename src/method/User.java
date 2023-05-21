package method;

public class User {
    int ID;
    String password;
    String email;

    public User() {
    }

    public User(int ID, String password, String email) {
        this.ID = ID;
        this.password = password;
        if (email!=null){
            this.email = email;
        }else {
            this.email=ID+"@gameschool.com";
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user=new User(12131,"admin",null);
        User user1=new User(112343,"sajdks","wdajksd@gmail.com");
        System.out.println(user);
        System.out.println(user1);
    }
}
