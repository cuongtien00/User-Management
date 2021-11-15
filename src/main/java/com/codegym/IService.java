package com.codegym;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IService<T> {
    void insertUser(T t) throws SQLException;

     T selectUser(int id);

    List<T> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(T t) throws SQLException;

    List<T> selectUser(String country);
}
