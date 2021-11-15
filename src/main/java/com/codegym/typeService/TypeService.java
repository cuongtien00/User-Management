package com.codegym.typeService;

import com.codegym.model.TypeUser;
import com.codegym.model.User;

import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TypeService implements ITypeService{
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Cuongtien1809";
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertUser(TypeUser typeUser) throws SQLException {

    }

    @Override
    public TypeUser selectUser(int id) {
        TypeUser typeUser = null;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select*from type where id =?;");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name = rs.getString("typeName");
                typeUser = new TypeUser(id,name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeUser;
    }

    @Override
    public List<TypeUser> selectAllUsers() {
        List<TypeUser> typeList = new ArrayList<>();

        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("select * from type;");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("typeName");
                typeList.add(new TypeUser(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(TypeUser typeUser) throws SQLException {
        return false;
    }

    @Override
    public List<TypeUser> selectUser(String country) {
        return null;
    }
}
