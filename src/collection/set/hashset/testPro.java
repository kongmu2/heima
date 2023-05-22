package collection.set.hashset;

import java.util.HashSet;

public class testPro {
    public static void main(String[] args) {
        Product vivo = new Product(1, "vivo", 4000);
        Product huawei = new Product(2, "huawei", 7000);
        Product iphone = new Product(3, "iphone", 10000);
        Product iphone1 = new Product(3, "iphone", 10000);

        HashSet<Product> hashSet = new HashSet<>();
        hashSet.add(vivo);
        hashSet.add(huawei);
        hashSet.add(iphone);
        hashSet.add(iphone1);

        System.out.println(hashSet);


    }
}
