public class rectangle extends shape{
	private int l,w;
	public rectangle( int l, int w ){
		this.l = l;
		this.w = w;
	}

	@Override
	public int area(){
	return l*w;
	}
	
}