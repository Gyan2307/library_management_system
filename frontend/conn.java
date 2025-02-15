package bms;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){

        try {

            c = DriverManager.getConnection("jdbc:mysql:///library_db1", "root", "123456");
            //c = DriverManager.getConnection("jdbc:mysql://0.tcp.in.ngrok.io:15316/library_db1", "root", "123456");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}