package method;

public class Address {
    private String address;
    private int zipCode;

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String address, int zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

}
