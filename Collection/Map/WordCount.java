import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map.Entry;


public class WordCount{
	public static void main(String [] args){
		System.out.println("Enter any string");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try{
			str = keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		String [] word = str.split(" ");
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		for(int i=0; i<word.length;i++){
			if(myMap.containsKey(word[i]))
				myMap.put(word[i],myMap.get(word[i])+1);
			else
				myMap.put(word[i],1);
			
		}
		for(Entry<String,Integer> myEntry:myMap.entrySet()){
			System.out.println(myEntry.getKey() + " "+myEntry.getValue());
		}
		
	}
}
