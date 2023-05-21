package JDBC;


import java.sql.*;

public class pararedstatement {
//    @Test
//    public void test ()throws  Exception{
//
//        String url="jdbc:mysql://127.0.0.1:3306/user";
//        String username="root";
//        String password="111111";
//        Connection rs= DriverManager.getConnection(url,username,password);
//
//        String name="张三";
//        String pwd="1234";
//        //没有防止SQL注入的sql语句
//        String sql="select * from tb_user where username='"+name+"'and password='"+pwd+"' ";
//
//
//        Statement stmt =rs.createStatement();
//
//        ResultSet r= stmt.executeQuery(sql);
//
//        if (r.next()){
//            System.out.println("登录成功");
//        }else {
//            System.out.println("登录失败");
//        }
//
//
//
//        rs.close();
//        r.close();
//        stmt.close();
//    }

    public void preparedstatement ()throws  Exception{

        String url="jdbc:mysql://127.0.0.1:3306/user";
        String username="root";
        String password="111111";
        Connection rs= DriverManager.getConnection(url,username,password);

        String name="张三";
        String pwd="12345";
        //没有防止SQL注入的sql语句
        String sql="select * from tb_user where username= ? and password= ? ";

        //用PreparedStatement预防SQL注入
        PreparedStatement st =rs.prepareStatement(sql);
        st.setString(1,name);
        st.setString(2,pwd);
        ResultSet r= st.executeQuery();


            if (r.next()){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
            rs.close();
            r.close();
            st.close();
        }
}
