package heima.test1.collections;

import java.util.Objects;

public class obd implements Comparable<obd>{
    private String name;
    private int age;
    private String project;

    public obd(String name, int age, String project) {
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
        obd obd = (obd) o;
        return age == obd.age && Objects.equals(name, obd.name) && Objects.equals(project, obd.project);
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
    public int compareTo(obd o) {

        return this.age-o.age >=0 ? 1:-1;
    }
}
