

public class SingletonCounter {

	private SingletonCounter(){
		
	}

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
