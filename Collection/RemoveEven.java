import java.util.*;

public class RemoveEven{
	public static void main(String args[]){
		Set<Integer> numList = new HashSet<Integer>();
		for(int i=1;i<=5;i++){
			numList.add(i);
		}
		for(Iterator<Integer> temp = numList.iterator(); temp.hasNext();){
			Integer it = temp.next();
			if(it%2==0)
				temp.remove();
		}
		System.out.println("Odd List");
		for(Integer temp:numList){
			System.out.println(temp);
		}
	}

}