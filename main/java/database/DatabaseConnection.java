package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco"; // substitua pelo nome do seu banco
    private static final String USER = "usuario"; // substitua pelo seu usuário do MySQL
    private static final String PASSWORD = "senha"; // substitua pela sua senha do MySQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
