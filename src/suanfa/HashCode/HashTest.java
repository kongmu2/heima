package suanfa.HashCode;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

//    //重写equals方法
//    @Override
//    public boolean equals(Object object){
//        if (object == null) {
//            return false;
//        }
//        if (object == this) {
//            return true;
//        }
//        if (!(object instanceof HashTest)) {
//            return false;
//        }
//        HashTest other = (HashTest) object;
//        if (other.getI() == this.getI()) {
//            return true;
//        }
//        return false;
//    }

    public int hashCode(){
        return i%10;
    }

    public static void main(String[] args) {
        HashTest a=new HashTest();
        HashTest b=new HashTest();
        a.setI(1);
        b.setI(1);
        Set<HashTest> set=new HashSet<HashTest>();
        set.add(a);
        set.add(b);
        System.out.println(a.hashCode()==b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(set);
    }


}
