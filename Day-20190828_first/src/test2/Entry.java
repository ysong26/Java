package test2;

class Entry { //선조클래스
	String word;
	
	Entry(){
		System.out.println("***약어사전***");
	}
	
	Entry(String w){
		this(); //생성자일경우 this Entry()하면 오류
		word=w;
	}
	
	public void writeView() {
		System.out.println("약어: " + word);
	}
	
}
