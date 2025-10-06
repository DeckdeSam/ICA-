import java.sql.*;

class tEXT {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/Employee";
        String UserName = "root";
        String Password = "sameer";
        String query = "SELECT * FROM Emp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception");
        }

        try {
            Connection Con = DriverManager.getConnection(url, UserName, Password);
            System.out.println("Connection established successfully!!!");

            Statement stmt = Con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                String Job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println();
                System.out.println("=============");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Job Title: " + Job_title);
                System.out.println("Salary: " + salary);
            }
        } catch (SQLException e) {
            System.out.println("SQL Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
