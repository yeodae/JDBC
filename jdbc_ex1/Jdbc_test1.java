package jdbc_ex1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_test1 {
	
	static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException{
		System.out.println(col1+"\t|\t" +col2+"\t\t|\t"+col3);
		while (srs.next()) {
//			if (!col1.equals("")) //생략가능
			System.out.print(srs.getString("stu_name"));
//			if (!col2.equals(""))
			System.out.print("\t|\t" + srs.getString("stu_no"));
//			if (!col3.equals(""))
			System.out.println("\t|\t" + srs.getString("stu_dept"));
//			else 
//			System.out.println();
			}
	}
	public static void main(String[] args) {

		Connection conn;
		Statement stmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost = 127.0.0.1 = 내 ip주소
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from student");
			printData(srs, "name", "id", "dept");
			srs = stmt.executeQuery("select stu_name, stu_no"
					+", stu_dept from student where stu_name='옥한빛'"); 
//			printData(srs, "name", "id", "dept");
			
		}catch(ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로드 오류");
//			System.out.println(e.getMessage());
		}catch(SQLException e){
			System.out.println("DB 연결 오류");
		}
	}

}
