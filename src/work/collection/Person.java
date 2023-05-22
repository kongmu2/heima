package work.collection;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{
    private int id;
    private String  name;
    private int age;


    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.age != o.age) {
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}