//Assignment 6
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent {

    @Override
    public String display() 
    {
        String beginning = "\nCOMPOSITE START: \n" ;
        
        for(ShapeComponent s : mList) {
            beginning += s.display() + "\n";
        }

       beginning += "COMPOSITE END\n";

       return beginning;

        
    }

    public void add(ShapeComponent c) 
    {
        mList.add(c);
	}

    private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();

}
