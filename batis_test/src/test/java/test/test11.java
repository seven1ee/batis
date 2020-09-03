package test;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import testpackage.dao.IUserDao;
import testpackage.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test11
{
    @Test
    public void test() throws IOException
    {
        //1.配置文件
        InputStream input = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建factorysessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory fac = builder.build(input);
        //3.创建sqlsession对象
        SqlSession session = fac.openSession();
        //4.使用sqlsession创建Dao接口代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users=userDao.findAll();
        for (User user:users
             ) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        input.close();

    }
}
