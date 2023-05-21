package heima.test1.treeSet;

import java.util.Objects;

public class obj implements Comparable<obj>{
    private String name;
    private int age;
    private String project;

    public obj(String name, int age, String project) {
        this.name = name;
        this.age = age;
        this.project = project;
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

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        obj obj = (obj) o;
        return age == obj.age && Objects.equals(name, obj.name) && Objects.equals(project, obj.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, project);
    }

    @Override
    public String toString() {
        return "obj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", project='" + project + '\'' +
                '}';
    }
    //类比较器
    @Override
    public int compareTo(obj o) {
        return this.age-o.age >=0 ? 1:-1;
    }
}
