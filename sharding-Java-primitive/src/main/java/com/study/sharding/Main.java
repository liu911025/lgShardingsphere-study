package com.study.sharding;

import com.study.sharding.config.DataSourceConfig;
import com.study.sharding.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        String sql = "select * from user";
        List<User> users = getUsers(sql);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    static List<User> getUsers(final String sql) throws SQLException {
        List<User> result = new LinkedList<>();
        try (Connection connection = DataSourceConfig.dataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                User user= new User();
                //省略设置User对象的赋值语句
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSex(resultSet.getInt("sex"));
                result.add(user);
            }
        }
        return result;
    }

}
