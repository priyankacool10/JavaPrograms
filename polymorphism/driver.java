public class driver{
	public static void main( String args[]){
		shape obj = new shape();
		int val = obj.area();
		System.out.println("Area: " + val);
		obj = new square(5);
		val = obj.area();
		System.out.println("Area of square is: "+ val);
		obj = new rectangle( 2, 3 );
		val = obj.area();
		System.out.println("Area of rectangle is: "+val);
	}


}