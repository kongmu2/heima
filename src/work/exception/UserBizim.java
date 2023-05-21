package work.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;


public class UserBizim implements UserBiz{
    public static Map<String,User> map;
    static {
        map=new HashMap<>();
        map.put("admin",new User("admin","admin","Administrator","admin@123.com"));
        map.put("Tom",new User("Tom","cat","tomcat","tomcat@cat.com"));
    }

    @Override
    public void register(String username, String password, String confpwd, String name, String email) throws RegisterException {
        User user=map.get(username);
        if (user!=null){
            throw new RegisterException("用户名已存在");
        }
        if(!password.equals(confpwd)){
            throw new RegisterException("密码不一致");
        }
        map.put(username,new User(username,password,name,email));

    }

    @Override
    public void login(String username, String password) throws LoginException {

       if (!map.containsKey(username)){
           throw new LoginException("用户名不存在");
       }

       User user=map.get(username);
       if (!user.getPassword().equals(password)){
           throw new LoginException("密码错误");
       }
    }
}
