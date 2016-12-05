import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Read {
	
	private Path file;
	private String read;
	private File currentFile;
	private ArrayList<File> fileCollection = new ArrayList<>();
	
	public Read(String path, String comPath) {
		Charset charset = Charset.forName("UTF-8");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	File readFile = new File(line);
		        read = line;
		        this.currentFile = readFile;
		    }
		    fileCollection.add(currentFile);
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
	
	public String getCurrentLine() {
		return this.read;
	}
	
	public File getFile() {
		return this.currentFile;
	}
	
	public String getLine() {
		return this.read;
	}
	
	public Path getPath() {
		return this.file;
	}
}
