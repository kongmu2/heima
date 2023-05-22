package work.collection;

import java.util.HashSet;
import java.util.Iterator;

public class testphone {
    public static void main(String[] args) {
        HashSet<Phone> phones = new HashSet<>();

        Phone phone = new Phone("苹果", 100, "11");
        Phone phone1 = new Phone("华为", 7000, "30");
        phones.add(phone);
        phones.add(phone1);

        for (Phone ph: phones) {
            if (ph.getPrice()<200){
                ph.setPrice(ph.getPrice()+500);
            }
        }

        Iterator<Phone> iterator = phones.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
