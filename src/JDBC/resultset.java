package JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class resultset {
    //ResultSet执行DQL查询语句
    public void testresult ()throws  Exception{

        String url="jdbc:mysql://127.0.0.1:3306/work";
        String username="root";
        String password="111111";
        Connection rs= DriverManager.getConnection(url,username,password);


        //创建语句
        String sql="select * from account";

        //获取操作对象
        Statement stmt=rs.createStatement();

        //执行sql并返回
        ResultSet r=stmt.executeQuery(sql);

        //遍历r里的数据
        while (r.next()){
            //获取数据
            int id =r.getInt(1);
            String name=r.getString("name");//可以用列名做参数
            double money=r.getInt(3);

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
        }

        rs.close();
        r.close();
        stmt.close();
    }

    //把account账户表数据封装为account对象 存储到arraylist数组中

    //
    public void testresult2 ()throws  Exception{

        String url="jdbc:mysql://127.0.0.1:3306/work";
        String username="root";
        String password="111111";
        Connection rs= DriverManager.getConnection(url,username,password);


        //创建语句
        String sql="select * from account";

        //获取操作对象
        Statement stmt=rs.createStatement();

        //执行sql并返回
        ResultSet r=stmt.executeQuery(sql);

        //遍历r里的数据
        while (r.next()){
            //创建对象
            account acc=new account();

            ArrayList<account> list=new ArrayList<>();

            //获取数据
            int id =r.getInt(1);
            String name=r.getString("name");//可以用列名做参数
            double money=r.getInt(3);

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);

            acc.setId(id);
            acc.setName(name);
            acc.setMoney(money);

            list.add(acc);
            System.out.println(list);
        }

        rs.close();
        r.close();
        stmt.close();
    }
}
