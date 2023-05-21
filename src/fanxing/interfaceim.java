package fanxing;

public class interfaceim implements testinterface<String>{

    @Override
    public String getT(String s) {
        return s;
    }

    @Override
    public String getString(String s) {
        return s;
    }

    public static void main(String[] args) {
        interfaceim interfaceim = new interfaceim();
        System.out.println(interfaceim.getT("sda"));
        System.out.println(interfaceim.getString("sdhjaj"));
    }
}
