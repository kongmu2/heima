package JDBC;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class druid {
    public static void main(String[] args) throws Exception{
        //加载配置文件
        Properties pr=new Properties();
        pr.load(new FileInputStream("src//druid.properties"));
        //获取实验对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(pr);

        //获取数据库连接
        Connection connection=dataSource.getConnection();


        System.out.println(connection);
        //获取当前文件路径
//        System.out.println(System.getProperty("user.dir"));

    }
}
