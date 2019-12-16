package p353;

import java.util.HashMap;
import java.util.Map;

public class SyncTest {
	private static Map<String, Integer> map=new HashMap<>();
	
	public synchronized static void increment() {
		Integer counter = map.get("COUNTER");
		counter++;
		map.put("COUNTER",counter);
	}
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			public void run() {
				int i=0;
				increment();
			}
		});
		
		thread.start();
	
	}

}
