import java.sql.*;

public class demo {
  public static void main(String[] args) throws Exception{
      System.out.println("Hello");
      /*
          import package
          load and register
          create connection
          create statement
          execute statement
          process the results
          close
      */
      int sid = 5;
      String sname = "Venkat";
      int marks = 30;
      String url = "jdbc:postgresql://localhost:5432/demo";
      String user= "postgres";
      String password = "Spring@3";
      String sql = "insert into student values (?,?,?)";

      Class.forName("org.postgresql.Driver");
      Connection con = DriverManager.getConnection(url,user,password);

      PreparedStatement st = con.prepareStatement(sql);
      st.setInt(1,sid);
      st.setString(2,sname);
      st.setInt(3,marks);

//      ResultSet rs = st.executeQuery("select sname from student where sid = 1");
      st.execute();
      con.close();




  }
}
