import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map.Entry;


public class KeySet{
	public static void main(String [] args){
		System.out.println("Enter any string");
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		map1.put("a",1);
		map1.put("b",4);
		map1.put("c",8);
		map1.put("d",2);
		map2.put("b",4);
		map2.put("c",8);
		Set mapSet1 = map1.keySet();
		Set mapSet2 = map2.keySet();
		System.out.println(mapSet1);
		System.out.println(mapSet2);
		
		if(mapSet1.contains(temp))
		System.out.println("Keys of one map is subset of another"); /*Not working as required*/
	}
}
