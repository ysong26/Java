package p88_1;

public enum Season {
	SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");
	
	final private String name;

	Season(String name){
		this.name=name;
	}
	
	String value() {
		return name;
	}
}
