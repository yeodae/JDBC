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
			System.out.println("������ ����");
		}
	}
	
	static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException{
		System.out.println(col1+"\t|\t" +col2+"\t\t|\t"+col3);
		while (srs.next()) {
//			if (!col1.equals("")) //��������
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
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL ����̹� �ε�
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			
			stmt = conn.createStatement();
			
			while(true){
				System.out.println("1)�Է� 2)��� 3)���� 4)���� 5)��ü���");
				int num = s.nextInt();
				
				if(num==1){
					System.out.print("�й� �Է� : ");
					String stu_no = s.next();
					System.out.print("�̸� �Է� : ");
					String stu_name = s.next();
					System.out.print("�а� �Է� : ");
					String stu_dept = s.next();
//					System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
					stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");

				}
				if(num==2){
					System.out.println("����� ��� �Է�");
					printTable(stmt, s.next());
				}
				if(num==3){
					System.out.println("������ ��� �Է�");
					stmt.executeUpdate("delete from student where stu_name = ('" +s.next()+"')");
				}
				if(num==4){
					System.out.println("����");
					break;
				}
				if(num==5){
					ResultSet srs = stmt.executeQuery("select * from student");
					printData(srs, "name", "id", "dept");
				}
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
