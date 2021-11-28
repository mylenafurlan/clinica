package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author mylen
 */
public class Conexao {
    public static Connection Conexao (){
     java.sql.Connection conexao = null;
        String driver = "org.postgresql.jdbc.Driver";
        String url = "jdbc:postgresql://localhost:5432/crud";
        String user = "postgres";
        String password = "admin";
        
        //conexão com o banco de dados
        try {
            Class.forName (driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
        
    
    }
    
}