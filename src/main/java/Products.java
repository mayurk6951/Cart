import java.util.ArrayList;
import java.util.List;


public class Products {
    private final List<LineItem> products = new ArrayList<LineItem>();

    public Products () {
        this.initStoreItems();
    }

    public List<LineItem> getProducts() {
        return products;
    }

    public void initStoreItems() {
        String [] productNames = {"LV1", "LV2", "LV3" ,"Rolex1" , "Rolex2"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d, 50.00d, 60.00d};
        Integer [] stock = {10, 6, 10, 5, 4};
        Double [] productdiscount = {5.00d, 4.00d, 6.00d, 5.00d, 5.00d};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new LineItem(i+1, productNames[i], productPrice[i], stock[i], productdiscount[i]));
        }
    }
}