package by.kurs.database;

import java.sql.SQLException;
import java.util.Properties;

import javax.naming.InitialContext;

import com.mysql.jdbc.Connection;
import com.sun.appserv.jdbc.DataSource;

public class JDBCUtils {

    private DataSource dataSource;

	public JDBCUtils() {
    }

    public void init() {
        try {
            InitialContext initContext = new InitialContext();
            dataSource = (DataSource) initContext.lookup("mysql-databaza");
        } catch(Exception a){
        	
        }
    }

    public java.sql.Connection getConnection() throws SQLException {
    	
    	
    	if (dataSource == null) {
            throw new SQLException("DataSource is null.");
        }

        return  dataSource.getConnection();
    }

}
