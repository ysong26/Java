package p242;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathReader {

	public static void main(String[] args) {
		Path path = Paths.get("C:/DEV/sample1.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			
			for(String line; (line = reader.readLine()) !=null;) {
				System.out.println(line);
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}

	}

}
