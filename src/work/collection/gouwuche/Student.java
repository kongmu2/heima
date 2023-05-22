package work.collection.gouwuche;

public class Student {
    private int id;
    private String name;
    private int age;

    //构造函数
    public Student(int id, String name, int age) {
        this.id= id;
        this.name = name;
        this.age = age;
    }

    //getter和setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student parse(String studentString) {
        String[] fields = studentString.split(",");
        if (fields.length != 3) {
            throw new IllegalArgumentException("无法解析学生信息：" + studentString);
        }
        int id = Integer.parseInt(fields[0].trim());
        String name = fields[1].trim();
        int age = Integer.parseInt(fields[2].trim());
        return new Student(id, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        String studentInfo = "1001,张三,18";
        Student student = Student.parse(studentInfo);
        System.out.println(student);
    }
}