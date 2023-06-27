package enumerate;

public class Plus{
    private Plus(){};

    private enum EnumHolder{
        INSTANCE;
        private Plus instance;

        EnumHolder(){
            this.instance = new Plus();
        }

        private Plus getSingleton(){
            return instance;
        }
    }
    public static Plus getInstance(){
        return EnumHolder.INSTANCE.getSingleton();
//        return EnumHolder.INSTANCE.instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
}
