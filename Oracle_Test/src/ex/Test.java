package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn 
		= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aaa","bbb");
				System.out.println("DB접속 성공");
		
	PreparedStatement stmt=null;
	ResultSet table = null;
	stmt = conn.prepareStatement("select * from mbook");
	table=stmt.executeQuery();
	table.next();
	int money=table.getInt("money");
	
	Scanner scan = new Scanner(System.in);
	for(;;) {
		System.out.println("      -메뉴-\n(1.잔액 / 2.지출 / 3.수입 / 4.종료 ): ");
		int menu=scan.nextInt();
		if(menu==4) break;
		switch(menu) {
		case 1:
			stmt = conn.prepareStatement("select * from mbook");
			table=stmt.executeQuery();
			table.next();
			money=table.getInt("money");
			System.out.println("현재 잔액은" + money + "입니다.");
			break;
			
		case 2:
			System.out.println("지출을 입력해주세요: ");
			int output_money=scan.nextInt();
			stmt = conn.prepareStatement(
					"update mbook set money=money-?");
			stmt.setInt(1, output_money);
			stmt.executeUpdate();
			System.out.println("입력하신 금액은" +output_money + "입니다.");
			break;
			
		case 3:
			System.out.println("수입을 입력해주세요: ");
			int input_money=scan.nextInt();
			stmt = conn.prepareStatement(
					"update mbook set money=money+?");
			stmt.setInt(1, input_money);
			stmt.executeUpdate();
			System.out.println("입력하신 금액은" + input_money + "입니다.");
			break;
			
		case 4:
			break;
			}
		}
	System.out.println("종료 되었습니다.");
	}
}
