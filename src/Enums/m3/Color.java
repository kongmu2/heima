package Enums.m3;

public enum Color {
    RED(),GREEN("yqc1"),YELLOW("yqc2"),BLACK("yqc3")
    ;



    Color(String name) {
        this.name = name;
    }

    Color() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
