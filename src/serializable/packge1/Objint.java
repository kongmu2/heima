package serializable.packge1;

import java.io.Serializable;

public class Objint implements Serializable {
    private int i;
    private int j;
    private int k;

    public Objint(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public Objint() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    public int ave(){
        return (i+j+k)/3;
    }

    @Override
    public String toString() {
        return "Objint{" +
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                '}';
    }
}
