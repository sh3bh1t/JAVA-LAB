import java.sql.*;

public class jdbc{
    private static final String JDBC_URL= "jdbc:mysql://localhost:3306/studentdb";
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="";

    public static void main(String[] args) {
        try(Connection connection=DriverManager.getConnection(JDBC_URL, DB_USER,DB_PASSWORD)){
            Statement stmt = connection.createStatement();

            stmt.executeUpdate("INSERT INTO students(name,age) VALUES ('Raj',15)");
            System.out.println("row added");

            ResultSet rs= stmt.executeQuery("select * from students ");
            while(rs.next()){
                System.out.println("name : " + rs.getString("name") + " , age : " + rs.getInt("age"));
            }

            stmt.executeUpdate("UPDATE students SET age=19 WHERE name='Raj' ");
            System.out.println("row updated");

            stmt.executeUpdate("DELETE FROM students WHERE name='raj' ");
            System.out.println("row deleted");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}