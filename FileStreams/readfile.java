import java.io.FileReader;
import java.io.IOException;

public class readfile {
	public static void main(String[] arg) {
		FileReader src = null;
		try {
			src = new FileReader("sourcetext.txt");
		}
		catch(IOException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		int tempVar = 0;
		
		try {
			while ( (tempVar = src.read() ) != -1 ) {
				System.out.print((char)tempVar);
			}
			//src.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				src.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}