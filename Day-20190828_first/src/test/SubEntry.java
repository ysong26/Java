package test;

public class SubEntry extends Entry { //�ļ�Ŭ����
	private String definition; //�ʵ��
	private int year;
	
	public SubEntry(String word) {
		super(word);
	}
	
	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		super.writeView();
		System.out.println("����: " + definition);
		System.out.println("�ñ�: " + year + "��");
	}
}
