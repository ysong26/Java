package p242;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathWriter {

	public static void main(String[] args) {
		Path path = Paths.get("C:/DEV/sample1.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
			
			writer.append("test1입니다.");
			writer.newLine();
			writer.append("test2입니다.");
			
			System.out.println("문자 입력을 완료했습니다.");
			
		} catch(IOException ex) {
			System.err.println(ex);
		}
	}

}
