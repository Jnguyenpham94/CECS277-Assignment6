import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent {

    @Override
    public char[] display() 
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void add(ShapeComponent c) 
    {
        mList.add(c);
	}

    private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();

}
