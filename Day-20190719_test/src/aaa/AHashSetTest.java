package aaa;

	import java.util.*;
	
	public class AHashSetTest {
	 public static void main(String[] args) {
	  Set hs = new HashSet();
	  hs.add("�ܾ�"); //add ����߰�
	  hs.add("�ߺ�");
	  hs.add("����");
	  hs.add("�ߺ�");
	  hs.add("10");
	  hs.add("A");
	  hs.add("A");
	  System.out.println(hs);
	  System.out.println("��Ұ���="+hs.size()); //����� ���� ���
	 }
}
