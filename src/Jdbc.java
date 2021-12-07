import java.sql.*;

public class Jdbc
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * from student_details");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
