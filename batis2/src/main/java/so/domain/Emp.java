package so.domain;

import java.io.Serializable;


public class Emp implements Serializable
{
    private Integer id;
    private String name;
    private String sex;
    private String address;

    public Emp()
    {
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "id=" + id +
                ", name='" + name+ '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
