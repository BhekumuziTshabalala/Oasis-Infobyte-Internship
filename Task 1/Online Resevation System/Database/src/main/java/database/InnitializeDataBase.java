package database;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class InnitializeDataBase {
    Connection connection;

    public InnitializeDataBase() {
        String url = "jdbc:sqlite:registrationInfo.db";

        try {
            connection = DriverManager.getConnection(url); // Establishing Connection
            Statement stmt = null;

            stmt = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS login (\n"
                    + " username text PRIMARY KEY,\n"
                    + " password text NOT NULL"
                    + ");";

            stmt.execute(sql);

            Map<String, String> logInInformation = createLogins();

            for (Map.Entry<String, String> entry : logInInformation.entrySet()) {
                sql = "INSERT INTO login (username, password) VALUES (?, ?)";

                try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                    pstmt.setString(1, entry.getKey());
                    pstmt.setString(2, entry.getValue());
                    pstmt.executeUpdate();
                } catch (SQLException e) {
                    System.out.print("");
                }
            }

            System.out.println("Data inserted successfully");

        } catch (SQLException ex) {
            System.out.println();
        }


    }

    private Map<String, String> createLogins(){
        Map<String, String> map = new HashMap<>();
        map.put("max12","Open23");
        map.put("Sophie22","Qwerty77");
        map.put("Walter22","123456");
        return map;

    }
}
