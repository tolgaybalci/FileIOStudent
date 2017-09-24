import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileOperation {

	public void createDirectoy(String dir) {
		
		try {
			Files.createDirectories(Paths.get(dir));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createFile(String pathAndFile) {
		
		try {
			Files.createFile(Paths.get(pathAndFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeFile(String pathAndFile, String kelime) {
		
		try {
			Files.write(Paths.get(pathAndFile), kelime.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFromFile(String pathAndFile) {
		
		try {

			List<String> lines = Files.readAllLines(Paths.get(pathAndFile));
			
			for (String line : lines) {
				
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
