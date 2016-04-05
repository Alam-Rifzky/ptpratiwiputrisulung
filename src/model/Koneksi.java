package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Koneksi {
    protected String JDBC_Driver = "com.mysql.jdbc.Driver";
    protected String DB_URL="jdbc:mysql://localhost/doni";
    protected String user = "root";
    protected Connection conn;
    protected Statement stmt;
    
    public void buka_koneksi(){
        try {
            Class.forName(JDBC_Driver);
            conn = DriverManager.getConnection(DB_URL,"root","");
                    
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void tutup_koneksi(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("error in closing database connection");
        }
    }
    
    
}
