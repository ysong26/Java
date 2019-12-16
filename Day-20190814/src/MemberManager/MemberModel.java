package MemberManager;

import java.util.Vector;

//
//
//  @ Project : 주소관리 프로그램
//  @ File Name : MemberModel.java
//  @ Date : 2019-08-14
//  @ Author : 서예송
//
//

public class MemberModel {
	
	Vector column=new Vector();
	Vector list=new Vector();
	
	public MemberModel() {
		column.add("이름");
		column.add("나이");
		column.add("성별");
		column.add("주소");
		column.add("연락처");
		column.add("이메일");
	}

	//컬럼명을 입력
	public String getColumnNane(int index) {
		return String.valueOf(column.get(index));
	}
	
	public void setList(Vector list) {
		this.list=list;
	}
	
	
	//조회 0하면 이름 1하면 나이
	public int getColumnCount() {
		return column.size();
	}
	
	public int getRowCount() {
		return list.size();
	}
	
	public Object getValueAt(int row, int col) { //행 열
		Vector vec=(Vector)list.get(row);
		return vec.get(col);
	}
	
	
}
