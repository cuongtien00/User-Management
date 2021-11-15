package com.codegym.dao;

import com.codegym.IService;
import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO extends IService<User> {

//    su dung stored procedure
    User getUserById(int id);
    void insertUserStore(User user) throws SQLException;
    void addUserTransaction(User user, int[] permission);
    public List<User> sortByName();
    public void insertUpdateWithoutTransaction();

}