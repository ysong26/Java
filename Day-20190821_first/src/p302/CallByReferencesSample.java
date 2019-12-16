package p302;

public class CallByReferencesSample {

	public static void main(String[] args) {
		EntityTest entity=new EntityTest();
		entity.value=1;
		callByReference(entity);
		System.out.println("main :"+entity.value);

	}

	public static void callByReference(EntityTest entity) {
		entity=new EntityTest();
		entity.value = 2;
		System.out.println("callByValue :"+entity.value);
		
	}

}
