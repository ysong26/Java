package p93;

import java.util.ArrayList;
import java.util.List;

public class StringStack {
	private List<String> taskList;
	
	public StringStack() {
		taskList=new ArrayList<>(); //ArrayList<>=int[]같은거 크기지정X

	}
	public boolean push(String task) {
		return taskList.add(task);
	}
	
	public String pop() {
		if(taskList.isEmpty()) { //taskList비어있는지 확인
			return null; //비어있으면 null값 반환
		}
		return taskList.remove(taskList.size() -1);
	}
}
