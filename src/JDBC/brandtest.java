package JDBC;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class brandtest {
    public static void main(String[] args) throws Exception{
            test1();
//            test2insert();
//            test3delete();

}
public static void test1()throws Exception{
    Properties pr=new Properties();
    pr.load(new FileInputStream("src//druid.properties"));

    DataSource dataSource= DruidDataSourceFactory.createDataSource(pr);

    Connection conn=dataSource.getConnection();

    String sql="select * from tb_brand";

    PreparedStatement pre=conn.prepareStatement(sql);
    ResultSet r=pre.executeQuery();


    List<brand> brands=new ArrayList<>();
    while(r.next()){

        int id = r.getInt("id");
        String company_name = r.getString("company_name");
        String brand_name = r.getString("brand_name");
        int ordered = r.getInt("ordered");
        String description = r.getString("description");
        int status = r.getInt("status");

        brand b=new brand();
        b.setId(id);
        b.setBrand_name(brand_name);
        b.setCompany_name(company_name);
        b.setOrdered(ordered);
        b.setDescription(description);
        b.setStatus(status);


        brands.add(b);


    }
    System.out.println(brands);
    pre.close();
    r.close();
    conn.close();
}
    public static void test2insert()throws Exception{

        String brandName="香飘飘";
        String companyName="香飘飘有限公司";
        int ordered=3;
        String description="好喝";
        int status=1;



        Properties pr=new Properties();
        pr.load(new FileInputStream("src//druid.properties"));

        DataSource dataSource= DruidDataSourceFactory.createDataSource(pr);

        Connection conn=dataSource.getConnection();

        String sql="insert into tb_brand(brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";


        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setString(1,brandName);
        pre.setString(2,companyName);
        pre.setInt(3,ordered);
        pre.setString(4,description);
        pre.setInt(5,status);

        int count=pre.executeUpdate();


        if(count>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }

        pre.close();
        conn.close();
    }



    public static void test3update()throws Exception{

        String brandName="香飘飘";
        String companyName="香飘有限公司";
        int ordered=30;
        String description="真难喝";
        int status=1;
        int id=4;


        Properties pr=new Properties();
        pr.load(new FileInputStream("src//druid.properties"));

        DataSource dataSource= DruidDataSourceFactory.createDataSource(pr);


        Connection conn=dataSource.getConnection();


        String sql="update tb_brand set brand_name= ?,company_name= ?,ordered= ?,description= ?,status=? where id=?";


        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setString(1,brandName);
        pre.setString(2,companyName);
        pre.setInt(3,ordered);
        pre.setString(4,description);
        pre.setInt(5,status);
        pre.setInt(6,id);



        int count=pre.executeUpdate();

        if(count>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

        pre.close();
        conn.close();
    }


    public static void test3delete()throws Exception{

        int id=4;


        Properties pr=new Properties();
        pr.load(new FileInputStream("src//druid.properties"));

        DataSource dataSource= DruidDataSourceFactory.createDataSource(pr);


        Connection conn=dataSource.getConnection();


        String sql="delete from tb_brand where id = ?";


        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setInt(1,id);


        int count=pre.executeUpdate();

        if(count>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

        pre.close();
        conn.close();
    }
}


