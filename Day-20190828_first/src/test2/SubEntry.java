package test2;

public class SubEntry extends Entry { //�ļ�Ŭ����
	String definition;
	int year;
	
	SubEntry(String w){
		super(w); //����Ŭ������ ���� this�� �ڱ��ڽ����� ����
		
	}
	SubEntry(String word, String definition, int year){
		this(word);
		this.definition=definition;
		this.year=year;
		
	}
	public void printView() {
		super.writeView();
		System.out.println("����: " + definition);
		System.out.println("�ñ�: " + year);
	}
	
}