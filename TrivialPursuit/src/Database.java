import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.jdbc.EmbeddedDriver;

public class Database {

   public static void main(String[] args) {
      Database e =
         new Database();
      e.testDerby();
   }
   public void testDerby() {
      Connection conn = null;
      PreparedStatement pstmt;
      Statement stmt;
      ResultSet rs = null;
      
      String createSQL = "create table questions ("
      + "id integer not null generated always as"
      + " identity (start with 1, increment by 1),   "
      + "question varchar(100) not null, "
      + "answer1 varchar(100),"
      + "answer2 varchar(100),"
      + "answer3 varchar(100),"
      + "category varchar(100),"
      + "correctanswer integer,"
      + "constraint primary_key primary key (id))";
 
      try {
         Driver derbyEmbeddedDriver = new EmbeddedDriver();
         DriverManager.registerDriver(derbyEmbeddedDriver);
         conn = DriverManager.getConnection("jdbc:derby:database;create=true");
         conn.setAutoCommit(false);
         stmt = conn.createStatement();
         stmt.execute("drop table questions");
         stmt.execute(createSQL);

         pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
         pstmt.setString(1, "De quel couleur était le cheval blanc d'Henry IV ?");
         pstmt.setString(2, "Noir");
         pstmt.setString(3, "Blanc");
         pstmt.setString(4, "Gris");
         pstmt.setString(5, "Histoire");
         pstmt.setInt(6, 2);
         pstmt.executeUpdate();

         rs = stmt.executeQuery("select * from questions");
         while (rs.next()) {
            System.out.printf("%d %s %s %s %s %s %d\n",
            rs.getInt(1), rs.getString(2),
            rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
         }

         //stmt.execute("drop table questions");

         conn.commit();

      } catch (SQLException ex) {
         System.out.println("in connection" + ex);
      }

      try {
         DriverManager.getConnection
            ("jdbc:derby:;shutdown=true");
      } catch (SQLException ex) {
         if (((ex.getErrorCode() == 50000) &&
            ("XJ015".equals(ex.getSQLState())))) {
               System.out.println("Derby shut down normally");
         } else {
            System.err.println("Derby did not shut down normally");
            System.err.println(ex.getMessage());
         }
      }
   }
}
