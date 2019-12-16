package test2;

public class SubEntry extends Entry { //후손클래스
	String definition;
	int year;
	
	SubEntry(String w){
		super(w); //상위클래스에 접근 this는 자기자신한테 접근
		
	}
	SubEntry(String word, String definition, int year){
		this(word);
		this.definition=definition;
		this.year=year;
		
	}
	public void printView() {
		super.writeView();
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year);
	}
	
}