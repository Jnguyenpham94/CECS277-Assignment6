import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent {

    @Override
    public String display() 
    {
        String first = "COMPOSITE START:";
        
        for(ShapeComponent s : mList) s.display();
        
        String second = "COMPOSITE END"; 

       
        
    }

    public void add(ShapeComponent c) 
    {
        mList.add(c);
	}

    private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();

}
