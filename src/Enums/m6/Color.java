package Enums.m6;

public enum Color {

    RED("红色",0),
    YELLOW("黄色",1),
    GREEN("绿色",2)
    ;
    private String name;
    private int index;

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    Color() {
    }

    Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
