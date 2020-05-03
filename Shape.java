

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
