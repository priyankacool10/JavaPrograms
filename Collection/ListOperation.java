import java.util.*;

public class ListOperation{
	public static void main(String args[]){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i=1;i<=5;i++){
			numList.add(i);
		}
		System.out.println("Size of Array List is " + numList.size());
		System.out.println("List elements");
		ListIterator<Integer> li = numList.listIterator();
		for( ; li.hasNext(); ){
			Integer num = li.next();
			System.out.println(num);
		}
		System.out.println("List elements in reverse");
		for( ; li.hasPrevious(); ){
			Integer num = li.previous();
			System.out.println(num);
		}
		LinkedList<String> strList = new LinkedList<String>(); 
		strList.add("abc");
		strList.add("def");
		strList.add("abc");
		strList.add("ghi");
		System.out.println("Index of abc is: "+strList.indexOf("abc"));
		System.out.println("Size of Linked List is " + strList.size());
		strList.remove("abc");
		for( ListIterator<String> ls = strList.listIterator(); ls.hasNext(); ){
			String str = ls.next();
			System.out.println(str);
		}
		
	}

}