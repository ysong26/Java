package p72;

import java.io.File;

public class FileItem extends AbstractItem {
	public FileItem(String name) {
		super(name);
	}
	
	@Override
	public void print(String parentPath) {
		System.out.println(parentPath+File.separator+name); 

	}
}
