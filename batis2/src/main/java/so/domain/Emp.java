package so.domain;

import java.io.Serializable;
import java.util.Date;


public class Emp implements Serializable
{
//    private Integer id;
//    private String name;
//    private String sex;
//    private String address;

    private Integer empid;
    private String empname;
    private String empsex;
    private String empadd;

    @Override
    public String toString()
    {
        return "Emp{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empsex='" + empsex + '\'' +
                ", empadd='" + empadd + '\'' +
                '}';
    }

    //    @Override
//    public String toString()
//    {
//        return "Emp{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", sex='" + sex + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

//    public Integer getId()
//    {
//        return id;
//    }
//
//    public void setId(Integer id)
//    {
//        this.id = id;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public String getSex()
//    {
//        return sex;
//    }
//
//    public void setSex(String sex)
//    {
//        this.sex = sex;
//    }
//
//    public String getAddress()
//    {
//        return address;
//    }
//
//    public void setAddress(String address)
//    {
//        this.address = address;
//    }

    public Integer getEmpid()
    {
        return empid;
    }

    public void setEmpid(Integer empid)
    {
        this.empid = empid;
    }

    public String getEmpname()
    {
        return empname;
    }

    public void setEmpname(String empname)
    {
        this.empname = empname;
    }

    public String getEmpsex()
    {
        return empsex;
    }

    public void setEmpsex(String empsex)
    {
        this.empsex = empsex;
    }

    public String getEmpadd()
    {
        return empadd;
    }

    public void setEmpadd(String empadd)
    {
        this.empadd = empadd;
    }

    public Emp()
    {
    }

}
