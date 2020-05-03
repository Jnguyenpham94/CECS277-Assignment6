//Assignment 6
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class SingletonCounter {

	public static SingletonCounter getInstance() 
	{
		if(theInstance == null) theInstance = new SingletonCounter();
		return theInstance;
	}

	public int getCounter() 
	{
		return mCounter++;
	}

	private static int mCounter = 1; 
	private static SingletonCounter theInstance;
}
