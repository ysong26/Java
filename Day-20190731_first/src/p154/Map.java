package p154;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "Park");
		map.put("2", "Lee");
		map.put("3", "Hwang");
		
		Stream<Entry> stream = map.entrySet().stream();
		stream.forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}

}
