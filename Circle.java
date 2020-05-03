

public class Circle extends Shape{

    public Circle(int counter, int radius) 
    {
        super(counter);
        this.mRadius = radius;

	}

    @Override
    public String display() {
    
        return System.out.println("Circle: Count = " + super.getCounter() + ", Radius = " + mRadius);
    }

    private int mRadius;
}
