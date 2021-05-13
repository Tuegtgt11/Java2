package Java2_04;

import java.sql.*;

public class Ex2_1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String customer = "select * from customers";
            System.out.println("The SQL statement is: "+ customer+"\n");
            ResultSet print = stmt.executeQuery(customer);
            while (print.next()){
                String CustomerID = print.getString("CustomerID");
                String CompanyName = print.getString("CompanyName");
                String ContactName = print.getString("ContactName");
                String ContactTitle = print.getString("ContactTitle");
                String Address      = print.getString("Address");
                String City = print.getString("City");
                String Region = print.getString("Region");
                String PostalCode = print.getString("PostalCode");
                String Country = print.getString("Country");
                String Phone = print.getString("Phone");
                String 	Fax = print.getString("Fax");
                System.out.println(CustomerID+" , "+CompanyName+" , "+
                        ContactName+" , "+ContactTitle+" , "+Address+" , "+
                        City+" , "+Region+" , "+PostalCode+" , "+Country+" , "+
                        Phone+" , "+Fax);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
