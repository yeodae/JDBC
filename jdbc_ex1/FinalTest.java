package jdbc_ex1;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class FinalTest {
	
	static void printTable(Statement stmt, String stu_name) throws SQLException{
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("데이터 없음");
		}
	}
	
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
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Connection conn;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			
			stmt = conn.createStatement();
			
			while(true){
				System.out.println("1)입력 2)출력 3)삭제 4)종료 5)전체출력");
				int num = s.nextInt();
				
				if(num==1){
					System.out.print("학번 입력 : ");
					String stu_no = s.next();
					System.out.print("이름 입력 : ");
					String stu_name = s.next();
					System.out.print("학과 입력 : ");
					String stu_dept = s.next();
//					System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");

				}
				if(num==2){
					System.out.println("출력할 사람 입력");
					printTable(stmt, s.next());
				}
				if(num==3){
					System.out.println("삭제할 사람 입력");
					stmt.executeUpdate("delete from student where stu_name = ('" +s.next()+"')");
				}
				if(num==4){
					System.out.println("종료");
					break;
				}
				if(num==5){
					ResultSet srs = stmt.executeQuery("select * from student");
					printData(srs, "name", "id", "dept");
				}
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
