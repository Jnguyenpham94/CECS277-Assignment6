

public class Square extends Shape{

	public Square(int counter, int side) {

	super(counter); 
	mSide = side;

	}

	@Override
	public String display() {
		String firstPart = "Square: Count = " + super.getCounter();
		String other =  ", Side = " + mSide;
		String finished = firstPart + other;
		return finished;
	}

	private int mSide;

}
