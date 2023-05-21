package work.exception;

public class TESTlogreg {
    private static UserBizim userBizim=new UserBizim();
    private static UserViewim userViewim=new UserViewim();
    public static void main(String[] args) throws Exception {
        userViewim.start();
    }
}
