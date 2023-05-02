package airline;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn() throws Exception
    {  
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","Suchi#2002");    
        s =c.createStatement(); 
    }  
}  