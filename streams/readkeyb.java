import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class readkeyb {
	public static void main(String[] arg) throws IOException {
		BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in))kh;
		while(true) {
			String line = keyBoard.readLine();
			System.out.println(line);
		}
	}
}