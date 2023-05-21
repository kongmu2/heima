package Exception.test;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws customex {
        if (salary<=2500){
            throw new customex("薪资不能低于2500");
        }
        this.salary = salary;
    }

}
