package java_git_test;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 드라이버 설정
		final String driver = "org.mariadb.jdbc.Driver";
		// 아이피 설정
		final String db_ip = "localhost";
		// 포트 설정
		final String db_port = "3306";
		// 데이터 이름 설정
		final String db_name = "student_test";
		// 데이터 url 설정
		final String db_url = "jdbc:mariadb://"+db_ip+":"+db_port+"/"+db_name; 
		
		Connection conn = null;
		
		// 에러 발생 시 처리문
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(db_url, "root", "1234");
			if(conn != null) {
				System.out.println("접속성공");
			}
			
		// 에러가 발생할 경우 실행	
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("DB접속 실패");
			e.printStackTrace();
		}
	}

}
