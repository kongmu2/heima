package collection.list.arraylist;

public class Dog {
    private String name;
    private String strain;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", strain='" + strain + '\'' +
                '}';
    }

    public Dog(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
