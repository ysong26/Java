package p92;

import java.util.ArrayList;
import java.util.List;

public class CollectionType2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); //<String>으로 타입고정

		list.add("Java"); //위에서 제네릭스에 의해 타입이String으로 고정되어 숫자로 바꾸면 안들어감
		
		String element=list.get(0).toString();//언박싱(캐스트) 해줘야됨(String)get도 됨
											 //근데 .찍고 to string 나오면 이걸루 함
		
		System.out.println(element);
 	}

}