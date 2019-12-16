package kr.co.iotmit;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyService {
	static final int pagecount=5;	//한페이지에 보여줄 행 개수
	Scanner scan = new Scanner(System.in);
	
	int DefaultScreen(){
		MoneyDAO moneyDAO = new MoneyDAO();
		int count=moneyDAO.Count();	//전체 행 확인
		ArrayList<MoneyDTO> arryDTO=moneyDAO.List(count, pagecount);
		
		System.out.println("순번     날짜             항목     내역       수입      지출");
		for(MoneyDTO value:arryDTO) {
			System.out.print(value.getNo()+"  ");
			System.out.print(value.getDate()+"  ");
			System.out.print(value.getCategory()+"  ");
			System.out.print(value.getParticulars()+"  ");
			if(value.getMoney()>0)
				System.out.println(value.getMoney());
			else System.out.println("                  "+ value.getMoney());
			System.out.println("---------------------------------------------------");
		}
		//전체수입:    전체지출:     잔액:
		System.out.print("총수입:"+moneyDAO.TotalReceived()+"      ");
		System.out.print("총지출:"+moneyDAO.TotalPaid()+"       ");
		System.out.println("현재잔액:"+moneyDAO.Balance());
		
		System.out.println("숫자를 입력해주세요:1.수입  2.지출  3.수정  4.삭제 : ");
		int input=scan.nextInt();
		return input;
	}
	int DeleteScreen() {
		System.out.println("몇번을 삭제하시겠습니까? ");
		int input=scan.nextInt();
		return input;
	}
	void DeleteRow(int row) {
		MoneyDAO moneyDAO = new MoneyDAO();
		moneyDAO.Delete(row);	//전체 행 확인
	}
}









