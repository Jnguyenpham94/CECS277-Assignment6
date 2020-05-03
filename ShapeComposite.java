

<<<<<<< Updated upstream
public class ShapeComposite {
=======
    @Override
    public String display() 
    {
        System.out.println("COMPOSITE START:\n");
        
        for(ShapeComponent s : mList)
        {
            s.display();
        }

        return  "COMPOSITE END\n"; 
    }

    public void add(ShapeComponent c) 
    {
        mList.add(c);
	}

    private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();
>>>>>>> Stashed changes

}
