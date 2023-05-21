package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class statement {
    //Statement执行DDL语句和DML语句

    public void testDML()throws  Exception{
        String url="jdbc:mysql://127.0.0.1:3306/work";
        String username="root";
        String password="111111";
        Connection conn= DriverManager.getConnection(url,username,password);

        //定义sql语句
        String sql="UPDATE account set money=5000 where id=1";


        //执行DDL不能用count大于零来判断
        String sql1="drop database sb";

        //获取执行对象
        Statement stmt= conn.createStatement();


        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql
            int count=stmt.executeUpdate(sql1);//返回受影响的行数
            //处理结果
            if(count>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }

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
