package temp2;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMashine implements ProductMashine {
    List<HotDrink> listHotDrink = new ArrayList<>();

    @Override
    public void initProducts() {

    }

    public void initProducts(List<HotDrink> listHotDrink) {
        this.listHotDrink = listHotDrink;
    }

    @Override
    public Product getProduct() {
        return null;
    }

    public HotDrink getProduct(String name) {
        for (HotDrink prod : listHotDrink) {
            if (prod.getName().equals(name))
                return prod;
        }
        return null;
    }

    public HotDrink getProduct(double cost) {
        for (HotDrink prod : listHotDrink) {
            if (cost == prod.getCost())

                return prod;
        }
        return null;
    }

    public HotDrink getProduct(int temperature) {
        for (HotDrink prod : listHotDrink) {
            if (prod.getTemperature() == temperature)

                return prod;
        }
        return null;
    }

    public List<HotDrink> getList() {
        return listHotDrink;

    }

}
