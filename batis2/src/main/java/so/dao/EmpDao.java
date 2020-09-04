package so.dao;

import org.apache.ibatis.io.Resources;
import org.junit.Before;
import so.domain.Emp;

import java.io.IOException;
import java.util.List;


public interface EmpDao
{
    List<Emp> findAll();
}
