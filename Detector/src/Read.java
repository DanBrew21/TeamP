import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {

	private File file;
	private File comparative;
	
	public Read(String path, String comPath) {
		this.file = new File(path);
		this.comparative = new File(comPath);
	}
	
	public void openFile() throws FileNotFoundException {
		if(this.file != null) {
			FileReader fr = new FileReader(this.file);
			BufferedReader br = new BufferedReader(fr);
		}
	}
	
	public void setFile(String file) {
		this.file;
	}
	
	public String getFile() {
		return this.file;
	}
	
	public void setComparable(String file) {
		this.comparative = file;
	}
	
	public String getComparable() {
		return this.comparative;
	}
}
