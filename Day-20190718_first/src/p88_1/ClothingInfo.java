package p88_1;

	//VO
public class ClothingInfo {
	String code;
	String name;
	String material;
	Season season; //Season enum에서 들고와서
	//int season;
	
/*	DTO
	static final int SPRING=1; //C에서 Define = final
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;*/
	
	
	ClothingInfo(String code, String name, String material,Season season){
	this.code=code;
	this.name=name;
	this.material=material;
	this.season=season;
	}
}
