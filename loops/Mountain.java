public class Mountain{
	public static void main(String [] args){
		int star=9;
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int j=star;j>=1;j--)
				System.out.print("*");
			star = star - 2;
			System.out.println();
		}
	}
}