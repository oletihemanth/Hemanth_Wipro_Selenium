package jdbc_connectivity;

import java.sql.*;

public class Employee_table {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/queries";
        String user = "root"; 
        String password = "Hemanth@2002"; 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            CallableStatement cs1 = conn.prepareCall("{call addbonus11()}");
            cs1.execute();
            System.out.println("Bonus of 5000 added to all employees.");
            
            CallableStatement cs2 = conn.prepareCall("{call samenameemp11()}");
            ResultSet rs2 = cs2.executeQuery();
            System.out.println("\nEmployees with duplicate names:");
            while (rs2.next()) {
                int id = rs2.getInt("id");
                String name = rs2.getString("name");
                float salary = rs2.getFloat("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

            CallableStatement cs3 = conn.prepareCall("{call highlowsal11()}");
            ResultSet rs3 = cs3.executeQuery();
            if (rs3.next()) {
                float highest = rs3.getFloat("highestsalary");
                float lowest = rs3.getFloat("lowestsalary");
                System.out.println("\nHighest Salary: " + highest);
                System.out.println("Lowest Salary: " + lowest);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

