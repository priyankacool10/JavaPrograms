import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
* Set Operations
* 
* @author Priyanka Kapoor
* Feb 24, 2014
*
*/

public class SetOperation2{
	public static void main(String [] args){
		Set<Integer> A = new HashSet<Integer>();
		for(int i=1; i<=3;i++){
			A.add(i);
		}
		
		Set<Integer> B = new HashSet<Integer>();
		for(int i=3; i<=5;i++){
			B.add(i);
		}
		String choice=null;
		System.out.println("Enter Your Choice");
		System.out.println("a. Union Operation");
		System.out.println("b. Intersection Operation");
		System.out.println("c. Difference Operation");
		System.out.println("d. Exit");
		BufferedReader keyboard = new BufferedReader( new InputStreamReader (System.in));
		try{
			choice= keyboard.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		switch(choice){
			case "a":
				 A.addAll(B);
				System.out.println("Union Operation Result");
				break;
			case "b":
				 A.retainAll(B);
				System.out.println("Intersection Operation Result");
				break;
			case "c":
				 A.removeAll(B);
				System.out.println("Difference Operation Result");
				break;
			case "d":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!");
				System.out.println("Elements of A are:");
		}
		for(Integer temp: A){
			System.out.println(temp);
		}	
	}
}