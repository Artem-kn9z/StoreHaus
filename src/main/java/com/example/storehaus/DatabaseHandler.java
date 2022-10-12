package com.example.storehaus;

import java.net.CookieHandler;
import java.nio.file.attribute.UserPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }


    public void singUpUser(String firstName, String lastName, String userName, String password){
        String insert = "INSERT INTO " + Const.USER_TABLE + "("
                + Const.USER_FIRSTNAME + "," + Const.USER_LASTNAME + ","
                + Const.USER_USERNAME + "," + Const.USER_PASSWORD + ")"
                + "VALUES(?,?,?,?)";


        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, userName);
            prSt.setString(4, password);

            prSt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    //write...

}
