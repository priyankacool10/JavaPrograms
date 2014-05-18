import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class filecopy {
	
	public static void main(String[] arg) throws IOException {
		FileInputStream sourceFile = new FileInputStream("sourcetext.txt");
		FileOutputStream destinationFile = new FileOutputStream("destination.txt");
		int tempVar = 0;
		while ( (tempVar = sourceFile.read()) != -1 ) {
			destinationFile.write(tempVar);
		}	
		System.out.println("Done");
	}

}