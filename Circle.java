//Assignment 6
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class Circle extends Shape{

    public Circle(int counter, int radius) 
    {
        super(counter);
        this.mRadius = radius;

	}

    @Override
    public String display() {
    
        String first = "Circle: Count = " + super.getCounter(); 
        String second = ", Radius = " + mRadius;
        String finalString = first + second;
        return finalString;
    }

    private int mRadius;
}
