package p93;

import java.util.ArrayList;
import java.util.List;

public class StringStack {
	private List<String> taskList;
	
	public StringStack() {
		taskList=new ArrayList<>(); //ArrayList<>=int[]������ ũ������X

	}
	public boolean push(String task) {
		return taskList.add(task);
	}
	
	public String pop() {
		if(taskList.isEmpty()) { //taskList����ִ��� Ȯ��
			return null; //��������� null�� ��ȯ
		}
		return taskList.remove(taskList.size() -1);
	}
}
