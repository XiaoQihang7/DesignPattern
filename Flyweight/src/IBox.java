public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}

class LBox extends AbstractBox {
    @Override
    public String getShape() {
        return "L";
    }
}

class OBox extends AbstractBox {
    @Override
    public String getShape() {
        return "O";
    }
}