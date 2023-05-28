package serializable.packge4;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient int age;
    private static Book book;
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }
}
