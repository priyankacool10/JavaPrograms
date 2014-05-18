import java.util.*;

public class SetOperation{
	public static void main(String [] args){
		Set<Integer> A = new HashSet<Integer>();
		for(int i=1; i<=3;i++){
			A.add(i);
		}
		
		Set<Integer> B = new HashSet<Integer>();
		for(int i=3; i<=5;i++){
			B.add(i);
		}
		System.out.println("Intersection Operation");
		 A.retainAll(B);
		for(Integer temp: A){
			System.out.println(temp);
		}
		/*for(Iterator<Integer> temp=A.iterator()){
			if(temp.hasNext()){
				System.out.println(temp.next());
			}
		}*/

	}
}