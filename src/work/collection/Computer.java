package work.collection;

import java.util.Objects;

public class Computer {
    private int id;
    private String brand;
    private double hadsize;
    private double memsize;
    private double price;


    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", hadsize=" + hadsize +
                ", memsize=" + memsize +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHadsize() {
        return hadsize;
    }

    public void setHadsize(double hadsize) {
        this.hadsize = hadsize;
    }

    public double getMemsize() {
        return memsize;
    }

    public void setMemsize(double memsize) {
        this.memsize = memsize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Computer(int id, String brand, double hadsize, double memsize, double price) {
        this.id = id;
        this.brand = brand;
        this.hadsize = hadsize;
        this.memsize = memsize;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return id == computer.id && Double.compare(computer.hadsize, hadsize) == 0 && Double.compare(computer.memsize, memsize) == 0 && Double.compare(computer.price, price) == 0 && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, hadsize, memsize, price);
    }

    public Computer() {
    }
}
