import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DequeStack{
	public static void main(String [] args){
		Deque<Character> dq = new LinkedList<Character>();
		System.out.println("Enter a string");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try{
			str=keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		for(int i=0; i<str.length();i++){
			dq.offerFirst(str.charAt(i));	
		}
		while(true){
			Character temp=dq.pollFirst();
			if(temp==null)
				break;
			System.out.print(temp);
		}

		
	}
}