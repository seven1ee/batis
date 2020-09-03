package testpackage.dao;

import testpackage.domain.User;

import java.util.List;

public interface IUserDao
{
    List<User> findAll();
}
