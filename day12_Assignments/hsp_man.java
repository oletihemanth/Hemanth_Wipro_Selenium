package jdbc_connectivity;

import java.sql.*;

public class hsp_man {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/queries";
        String user = "root";
        String password = "Hemanth@2002";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
        	
            CallableStatement cs1 = conn.prepareCall("{CALL AvgPatientCountDaily()}");
            ResultSet rs1 = cs1.executeQuery();
            while (rs1.next()) {
                System.out.println(rs1.getDate("dateofjoin") + " - " + rs1.getInt("p_count"));
            }
            System.out.println("\nPatients in same ward");
            CallableStatement cs2 = conn.prepareCall("{CALL PatientsInSameWard(?)}");
            cs2.setInt(1, 101); 
            ResultSet rs2 = cs2.executeQuery();
            while (rs2.next()) {
                System.out.println(rs2.getInt("patient_id") + " - " + rs2.getString("name"));
            }

            System.out.println("\n Sort Patients by Admission Date");
            CallableStatement cs3 = conn.prepareCall("{CALL SortPatientsByAdmissionDate()}");
            ResultSet rs3 = cs3.executeQuery();
            while (rs3.next()) {
                System.out.println(rs3.getInt("patient_id") + " - " + rs3.getString("name") + " - " + rs3.getDate("admission_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
