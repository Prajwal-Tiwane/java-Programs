import java.sql.*;          // 1

class Database1
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/marvellous";
        String Username = "root";
        String Password = "";
        String Query = "select * from student1";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery(Query);      // 4

        while(robj.next())          // 5
        {
            System.out.println("RID : "+robj.getInt("RollNo"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("Address"));
            System.out.println("Age : "+robj.getInt("Age"));
            System.out.println("Marks : "+robj.getInt("Marks"));                                    
        }
    }
}

// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert