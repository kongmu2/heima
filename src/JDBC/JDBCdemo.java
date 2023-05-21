package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
    public static void main(String[] args) throws Exception {
        //注册驱动 注册后下次不用写
        //6.0.2之前用com.mysql.jdbc.Driver之后版本用com.mysql.CJ.jdbc.Driver
        Class.forName("com.mysql.jdbc.Driver");

        //获取链接  如果链接的是本机端口和ip可以省略IP和端口

        String url="jdbc:mysql://127.0.0.1:3306/work";
        String username="root";
        String password="111111";
        Connection conn= DriverManager.getConnection(url,username,password);

        //定义sql语句
        String sql="UPDATE account set money=3000 where id=1";
        String sql1="UPDATE account set money=3000 where id=2";

        //获取执行对象
        Statement stmt= conn.createStatement();

        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql
            int count=stmt.executeUpdate(sql);//返回受影响的行数
            //处理结果
            System.out.println(count);

            //执行sql
            int count1=stmt.executeUpdate(sql1);//返回受影响的行数
            //处理结果
            System.out.println(count1);

            //提交事务
            conn.commit();
        } catch (Exception throwables) {
            //事务回滚
            conn.rollback();
            throwables.printStackTrace();
        }


        //释放资源
        stmt.close();
        conn.close();
    }
}
