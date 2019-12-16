package aaa;

	import java.util.*;
	
	public class AHashSetTest {
	 public static void main(String[] args) {
	  Set hs = new HashSet();
	  hs.add("단어"); //add 요소추가
	  hs.add("중복");
	  hs.add("구절");
	  hs.add("중복");
	  hs.add("10");
	  hs.add("A");
	  hs.add("A");
	  System.out.println(hs);
	  System.out.println("요소개수="+hs.size()); //요소의 수를 취득
	 }
}
