package test2;

class Entry { //����Ŭ����
	String word;
	
	Entry(){
		System.out.println("***������***");
	}
	
	Entry(String w){
		this(); //�������ϰ�� this Entry()�ϸ� ����
		word=w;
	}
	
	public void writeView() {
		System.out.println("���: " + word);
	}
	
}
