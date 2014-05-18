import java.util.*;

public class PriorityQueue2{
	public static void main(String [] args){
		PriorityQueue<Integer> pg = new PriorityQueue<Integer>();
		pg.offer(23);
		pg.offer(1);
		pg.offer(54);
		while(true){
			Integer temp=pg.poll();
			if(temp==null)
				break;
			System.out.println(temp);
		}
	}
}