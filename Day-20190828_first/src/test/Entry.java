package test;

class Entry { //선조클래스
	private String word;//필드명

	public Entry() { //메소드
		System.out.println("***약어사전***"); //***약어사전***  (출력)
	}
	
	
	public Entry(String word) { //메소드 Entry()호출 
		 this();
		 this.word=word;
	}

	public void writeView() { //메소드
		System.out.println("약어:" + word); //약어출력
	}
}
