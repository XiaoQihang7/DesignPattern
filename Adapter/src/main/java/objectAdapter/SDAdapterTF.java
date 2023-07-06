package objectAdapter;

import classAdapter.SDCard;
import classAdapter.TFCard;

//创建适配器对象（SD兼容TF）
//改用对象适配器，只需要修改适配器类即可
public class SDAdapterTF  implements SDCard {

    //改用聚合
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("objectAdapter read tf card ");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("objectAdapter write tf card");
        tfCard.writeTF(msg);
    }
}

