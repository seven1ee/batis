package so.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import so.dao.EmpDao;
import so.dao.IUserDao;
import so.domain.Emp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmpTest
{
    private  EmpDao empDao;
    private  SqlSession session;
    InputStream input;
    @Before
    public void init() throws IOException
    {

        //读取配置文件
        input= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(input);
        //创建session对象
        session= factory.openSession();
        //使用sqlsession创建Dao接口的代理对象
        empDao = session.getMapper(EmpDao.class);
    }
    @After
    public void destory() throws IOException
    {
        session.commit();
        session.close();
        input.close();
    }


    @Test
    public void testFindAll()
    {
        List<Emp> emps= empDao.findAll();
        System.out.println(emps);

    }
}
