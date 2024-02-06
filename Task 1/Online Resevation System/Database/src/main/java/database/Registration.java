package database;

import com.sun.source.tree.BreakTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registration {
    Connection connection;
    Scanner sc = new Scanner(System.in);

    public boolean registerUser() {


        sc.close();

        return true;

    }


    private void establishConnection(){
        try {
            // db parameters
            String url = "jdbc:sqlite:registrationInfo.db";
            // Establishing Connection
            connection = DriverManager.getConnection(url);

            Statement stmt = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS login (\n"
                    + " username text PRIMARY KEY,\n"
                    + " password text NOT NULL,\n"
                    + ");";
            stmt.execute(sql);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private boolean login() {
        int numberOfChances = 3;

        if (connection == null) {
            establishConnection();
        }

        while(numberOfChances > 1){

            numberOfChances --;
        }


        return true;
    }

}
