package test;

class Entry { //����Ŭ����
	private String word;//�ʵ��

	public Entry() { //�޼ҵ�
		System.out.println("***������***"); //***������***  (���)
	}
	
	
	public Entry(String word) { //�޼ҵ� Entry()ȣ�� 
		 this();
		 this.word=word;
	}

	public void writeView() { //�޼ҵ�
		System.out.println("���:" + word); //������
	}
}
