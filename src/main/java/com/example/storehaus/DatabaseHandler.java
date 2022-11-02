package com.example.storehaus;

import javafx.fxml.Initializable;

import java.sql.*;

public class DatabaseHandler extends configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }


    public void singUpUser(String firstName, String lastName, String userName, String password, int nubOfLinID, int lastLineID){
        String insert = "INSERT INTO " + Const.USER_TABLE + "("
                + Const.USER_FIRSTNAME + "," + Const.USER_LASTNAME + ","
                + Const.USER_PASSWORD + "," + Const.USER_USERNAME +  "," + Const.USER_NUMBER_OF_LINES + "," + Const.USER_LAST_LINES + ")"
                + "VALUES(?,?,?,?,?,?)";


        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, userName);
            prSt.setString(4, password);
            prSt.setInt(5, nubOfLinID);
            prSt.setInt(6, lastLineID);

            prSt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public ResultSet getUser(User user){
        ResultSet resSet = null;

//        String select = "SELECT * FROM users ";// + Const.USER_TABLE + " WHERE " + Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=? AND " + Const.USER_FIRSTNAME + "=? AND " + Const.USER_LASTNAME + "=? AND "
//        // + "=? AND " + Const.USER_NUMBER_OF_LINES + "=? AND " + Const.USER_LAST_LINES  + "=?";

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USER_USERNAME + "=? AND " +
                Const.USER_PASSWORD + "=? AND " + Const.USER_FIRSTNAME + "=? AND " + Const.USER_LASTNAME + "=? AND "
                + Const.USER_NUMBER_OF_LINES + "=? AND " + Const.USER_LAST_LINES + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUserName());
            prSt.setString(2, user.getPassword());
            prSt.setString(3, user.getFirstName());
            prSt.setString(4, user.getLastName());
            prSt.setInt(5, user.getNubOfLinID());
            prSt.setInt(6, user.getLastLineID());


            resSet = prSt.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return resSet;
    }

    public ResultSet getUserLogin(User user){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USER_USERNAME + "=? AND " +
                Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUserName());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return resSet;
    }
    //write...

}
