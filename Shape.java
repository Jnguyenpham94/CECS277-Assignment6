//Assignment 6
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public abstract class Shape extends ShapeComponent
{
    public Shape (int count)
    {
        mCounter = count;
    }

    public int getCounter()
    {
        return mCounter;
    }

    private int mCounter;
}
