public class square extends shape{

	private int side;
	public square(int side){
	this.side=side;
	}

	@Override
	public int area(){
	return side*side;
	}

}