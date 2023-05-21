package method;

public class VariableParam {
    public int sum(int... a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
