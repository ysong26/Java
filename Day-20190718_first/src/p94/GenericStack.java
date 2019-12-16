package p94;
import java.util.ArrayList;
import java.util.List;

public class GenericStack<E> { //<E>�ȿ� string�� ���ٰ� �����ϸ� ��

	private List<E> taskList;
	
	public GenericStack() {
		taskList=new ArrayList<>();
	}
	public boolean push(E task) {
		return taskList.add(task);
	}
	
	public E pop() {
		if(taskList.isEmpty()) {
			return null;
		}
		
			return taskList.remove(taskList.size() -1);
	}
}
