package  MemberManager;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel {

	// ������ ���..
	Vector column = new Vector();// �÷������� ���� ����
	Vector list = new Vector(); // ���ڵ带 ���� ����(������� ������ ���� ���� )���ι���

	public MemberModel() {
		column.add("�̸�");
		column.add("����");
		column.add("����");
		column.add("�ּ�");
		column.add("����ó");
		column.add("�̸���");
	}

	// �÷����� �־�����!!
	public String getColumnName(int index) {
		return String.valueOf(column.get(index));
	}
	
	public void setList(Vector list) {
		this.list = list;
	}

	@Override
	public int getColumnCount() {
		// �÷� ������ ���� add 6�������ϱ�!! 6�̰���!
		
		return column.size(); 
	}

	@Override
	public int getRowCount() {
		
		return list.size(); // ���ڵ� ������..
		
	}

	@Override
	public Object getValueAt(int row, int col) {
		Vector vec = (Vector) list.get(row);
		return vec.get(col);
	}
}
