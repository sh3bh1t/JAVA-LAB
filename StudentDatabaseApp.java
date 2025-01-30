import java.sql.*;

public class StudentDatabaseApp {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            Statement stmt = connection.createStatement();

            // CREATE operation
            stmt.executeUpdate("INSERT INTO students (id, name, age, department) VALUES (1, 'John', 21, 'CS')");
            System.out.println("Record created.");

            // READ operation
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getInt("age") + ", " + rs.getString("department"));
            }

            // UPDATE operation
            stmt.executeUpdate("UPDATE students SET age = 22 WHERE name = 'John'");
            System.out.println("Record updated.");

            // DELETE operation
            stmt.executeUpdate("DELETE FROM students WHERE name = 'John'");
            System.out.println("Record deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
