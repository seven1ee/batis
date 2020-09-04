package so.dao;

import org.apache.ibatis.io.Resources;
import org.junit.Before;
import so.domain.Emp;

import java.io.IOException;
import java.util.List;


public interface EmpDao
{
    List<Emp> findAll();
    Emp findById(Integer userid);
    int save(Emp emp);
    int delete(Integer userid);
    int updateEmp(Emp emp);
}
