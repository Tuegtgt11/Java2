package Java2_09;

import java.sql.*;

public class update2jdbcSelect {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            PreparedStatement pstmt = conn.prepareStatement(
                    "insert in  to books values(?,?,?,?,?)");
            conn.setAutoCommit(false);
            pstmt.setInt(1,8003);
            pstmt.setString(2,"Java 123");
            pstmt.setString(3, "Kevin Jones");
            pstmt.setDouble(4,12.34);
            pstmt.setInt(5, 88);
            pstmt.addBatch();
            pstmt.setInt(1,8004);
            pstmt.setString(2,"Java 456");
            pstmt.addBatch();

            int[] returnCodes = pstmt.executeBatch();
            System.out.print("Return codes are: ");
            for (int code:returnCodes) System.out.printf(code+",");
            System.out.println();
            conn.commit();

            String strSelect = "select * from books";
            System.out.println("the SQL  statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();

            for (int i = 1; i<= numColums; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i =1; i<=numColums;i++){
                System.out.printf("%-30s", "("+rsetMD.getColumnName(i)+")");
            }
            System.out.println();
            while (rset.next()){
                for (int i=1;i<=numColums;i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
