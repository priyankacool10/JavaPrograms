import java.io.IOException;

public class ThrowsDemo{
	public void a() throws IOException{
		throw new IOException("Device Error");
	}

	public void b() throws IOException{
		a();
	}

	public void c(){
		try{
			b();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");		
		}
	}

	public static void main(String[] args){
		ThrowsDemo obj = new ThrowsDemo();
		obj.c();
		System.out.println("Normal Execution");
	}
}
