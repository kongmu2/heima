package work.exception;

public interface UserView{
    void login()throws LoginException;
    void register() throws RegisterException;
}
