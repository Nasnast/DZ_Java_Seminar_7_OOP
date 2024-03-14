package temp2;

import java.util.ArrayList;
import java.util.List;

public class ProductMashineWater implements ProductMashine {
    List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> listProducts) {
        this.listProduct = listProducts;
    }

    public Product getProduct(String name) {
        for (Product prod : listProduct) {
            if (prod.getName().equals(name))
                return prod;
        }
        return null;
    }

    public List<Product> getList() {
        return listProduct;

    }

    @Override
    public void initProducts() {

    }

    @Override
    public Product getProduct() {
        return null;
    }
}
