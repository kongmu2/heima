package work.exception;

public interface UserBiz {
    void register(String username,String password,String confpwd,String name,String email )throws RegisterException;

    void login(String username,String password)throws LoginException;
}
