package p243;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx {

	public static void main(String[] args) {
		Path path = Paths.get("C:/DEV/userlist.txt");
		
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			reader.lines()
			.map(s -> s.split(" ")[0]).distinct()
			.forEach(System.out::println);
			
		} catch (IOException ioe) {
			System.err.println(ioe);
		}

	}

}
