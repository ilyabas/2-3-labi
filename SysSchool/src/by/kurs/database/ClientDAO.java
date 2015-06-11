package by.kurs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.naming.InitialContext;

import by.kurs.Puples;

import com.mysql.jdbc.PreparedStatement;
import com.sun.appserv.jdbc.DataSource;
import com.sun.msv.writer.relaxng.Context;

public class ClientDAO {
	
	private final static String SQL_INSERT_INTO_PUPLES = "insert into puples values (?,?,?,?,?,?,?,?,?)";
	private final static String SQL_DELETE_FROM_PUPLES = "delete from puples where id_puple = ?";
	private final static String SQL_UPDATE_PUPLES = "update puples set name = ?, surname = ?, id_class = ?, "
			+ "math = ?, rus = ?, english = ?, average = ?, id_classhead = ? where id_puple = ? ";
	
	
	public ArrayList<Puples> showQuery (String sort){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Puples> puples = new ArrayList<Puples> ();
		
		try {
			JDBCUtils jdbc = new JDBCUtils();
			jdbc.init();
			
			 conn = jdbc.getConnection();		
			
			String sqlQuery = "Select id_puple,name,surname,класс,math,rus,english,HeadSurname from puples, classhead,класс where id_classhead = id_head and id_class = id_класс";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sqlQuery);
			
			
			int id;
			String name;
			String surname;
			String clas;
			int math;
			int rus;
			int english;
			String classhead;
			
			while (rs.next()) {
				
				id = rs.getInt("id_puple");
				name = rs.getString("name");
				surname = rs.getString("surname");
				clas = rs.getString("класс");
				math =  rs.getInt("math");
				rus = rs.getInt("rus");
				english = rs.getInt("english");
				classhead = rs.getString("HeadSurname");
				
				
				puples.add(new Puples (id,name,surname,clas,math,rus,english,classhead));
			}
			
				if (sort != null) {
					Collections.sort(puples);
				}
			
		} catch (SQLException se) {
			System.out.println ("SQLERROR " + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) try {rs.close();}catch(SQLException e){}
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return puples;
	}
	
	public void insertIntoPuples (int id,String name,String surname,int clas,int math,int rus,int english,int id_classhead){
		
		Connection conn = null;
		java.sql.PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			JDBCUtils jdbc = new JDBCUtils();
			jdbc.init();
			
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaza","root","pass");
			conn = jdbc.getConnection();
			stmt =   conn.prepareStatement(SQL_INSERT_INTO_PUPLES);
			
			int average = 0;
			average = Puples.makeAverage(math, rus, english);
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, surname);
			stmt.setInt(4, clas);
			stmt.setInt(5, math);
			stmt.setInt(6, rus);
			stmt.setInt(7, english);
			stmt.setInt(8, average);
			stmt.setInt(9, id_classhead);
			
			//stmtS.setInt(0,4);
			stmt.executeUpdate();
		} catch (SQLException se) {
			System.out.println ("SQLERROR " + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) try {rs.close();}catch(SQLException e){}
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updatePuples (int id,String name,String surname,int clas,int math,int rus,int english,int id_classhead) {
		Connection conn = null;
		java.sql.PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			JDBCUtils jdbc = new JDBCUtils();
			jdbc.init();
			
			conn = jdbc.getConnection();
			stmt =   conn.prepareStatement(SQL_UPDATE_PUPLES);
			
			int average = 0;
			average = Puples.makeAverage(math, rus, english);
			
			stmt.setInt(9, id);
			stmt.setString(1, name);
			stmt.setString(2, surname);
			stmt.setInt(3, clas);
			stmt.setInt(4, math);
			stmt.setInt(5, rus);
			stmt.setInt(6, english);
			stmt.setInt(7,average);
			stmt.setInt (8, id_classhead);
			
			stmt.executeUpdate();
		} catch (SQLException se) {
			System.out.println ("SQLERROR " + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				if(rs!=null) try {rs.close();}catch(SQLException e){}
				stmt.close();
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
	
	public void deleteFromKok (int id) {
		Connection conn = null;
		java.sql.PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {

			JDBCUtils jdbc = new JDBCUtils();
			jdbc.init();
			conn = jdbc.getConnection();
			stmt =   conn.prepareStatement(SQL_DELETE_FROM_PUPLES);
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			
		} catch (SQLException se) {
			System.out.println ("SQLERROR " + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				
				if(rs!=null) try {rs.close();}catch(SQLException e){}
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
