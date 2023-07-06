import java.util.HashMap;

public class BoxFactory {
    private HashMap<String , AbstractBox> map;
    private BoxFactory(){
        map= new HashMap<>();
        AbstractBox iBox = new IBox();
        AbstractBox LBox = new LBox();
        AbstractBox OBox = new OBox();
        map.put("I",iBox);
        map.put("L",LBox);
        map.put("O",OBox);
    }

    private static class GetBox{
        private static final BoxFactory instance = new BoxFactory();
    }

    public static BoxFactory getInstance(){
        return GetBox.instance;
    }

    public AbstractBox getBox(String shape){
        return map.get(shape);
    }

}
