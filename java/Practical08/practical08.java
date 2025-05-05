// WAP to connect a MySql database using JDBC insert,update, delete and display data from database
import java.sql.*; // Importing necessary SQL classes for JDBC
public class practical08 {
    public static void main(String[] args) {
// Database connection details
        String url = "jdbc:mysql://localhost:3306/lab10";
        String user = "root";
        String password = "Prithviraj#9876";
        try {
// Step 1: Load the JDBC driver (Optional in modern Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
// Step 2: Establish connection to the database
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected to the database!");
// Step 3: Insert data into "student" table using PreparedStatement
                String insertQuery = "INSERT INTO student (name, age) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                    pstmt.setString(1, "John"); // Setting the first parameter (name) to "John"
                    pstmt.setInt(2, 22);       // Setting the second parameter (age) to 22
                    pstmt.executeUpdate();      // Executing the INSERT query
                    System.out.println("Record inserted successfully.");
                }
// Step 4: Retrieve and display data from "student" table
                String selectQuery = "SELECT * FROM student"; // SQL query to fetch all records
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(selectQuery)) {
// Loop through result set and print each row
                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("id") + " " +      // Fetching "id" column
                                        rs.getString("name") + " " +   // Fetching "name" column
                                        rs.getInt("age")              // Fetching "age" column
                        );
                    }
                }
            } // Connection auto-closed here due to try-with-resources
        } catch (Exception e) {
            e.printStackTrace(); // Printing any exceptions that occur
        }
    }
}