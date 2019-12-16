package p92;

import java.util.ArrayList;
import java.util.List;

public class CollectionType1 {

	public static void main(String[] args) {
		List list=new ArrayList();

		list.add("Java");
		
		String element=list.get(0).toString();//언박싱(캐스트) 해줘야됨(String)get도 됨
											 //근데 .찍고 to string 나오면 이걸루 함
		
		System.out.println(element);
 	}

}