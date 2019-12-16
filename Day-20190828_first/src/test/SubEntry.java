package test;

public class SubEntry extends Entry { //후손클래스
	private String definition; //필드명
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
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year + "년");
	}
}
