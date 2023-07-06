/**
 * 组合模式又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对
 * 象，用来表示部分以及整体层次。
 */
//菜单组件 不管是菜单还是菜单项，都应该继承该类
public abstract class MenuComponent {
    protected String name;
    protected int level;

    //添加菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //移除菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName() {
        return name;
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}