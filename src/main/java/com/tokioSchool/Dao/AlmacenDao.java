package com.tokioSchool.Dao;

import com.tokioSchool.AppAlmacen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlmacenDao {

    private Connection connection;

    public AlmacenDao() throws SQLException {
        connection();
    }

    public void connection() throws SQLException {

        String url = "jbdc:sqlite:almacenes.db";
        connection = DriverManager.getConnection(url);
    }
    public void desconnection()throws SQLException{
        connection.close();
    }
    public void add(AppAlmacen appAlmacen) throws SQLException {

        String sql= "INSERT INTO almacen(identificador,nombre_pro,stock)" +
                "VALUES(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,appAlmacen.getIdentificador());
        statement.setString(2, appAlmacen.getNombrepro());
        statement.setString(3, appAlmacen.getStock());
        statement.executeUpdate();
    }
}