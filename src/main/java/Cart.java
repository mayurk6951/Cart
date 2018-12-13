import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;


class Cart {

    List<LineItem> cartItems = new ArrayList<LineItem>();

    public void addProductToCartByPID(int pid) {
        LineItem product = getProductByProductID(pid);
        addToCart(product);
    }

    public LineItem getProductByProductID(int pid) {
        LineItem product = null;
        List<LineItem> products = new Products().getProducts();
        for (LineItem prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    public void addToCart(LineItem product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int pid) {
        LineItem prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    private void addQuantity(int pid)
    {
        LineItem prod = getProductByProductID(pid);
        prod.setQuantity(prod.getQuantity()+1);
    }

    private void subtratQuantity(int pid)
    {
        LineItem prod = getProductByProductID(pid);
        if(prod.getQuantity()-1 ==0)
        {
            cartItems.remove(prod);
        }
        else {
            prod.setQuantity(prod.getQuantity() - 1);
        }
    }

    void printCartItems() {
        Double discountprice= 0.0d;
        Double undiscountprice = 0.0d;
        for (LineItem prod: cartItems) {
            System.out.println(prod.getName()+ "," + "DiscountedPrice:"+(prod.getQuantity()*(prod.getPrice()-prod.getDiscount()))+","+"UndiscountedPrice:"+(prod.getQuantity()*prod.getPrice()));
            discountprice = discountprice+(prod.getQuantity()*(prod.getPrice()-prod.getDiscount()));
            undiscountprice =undiscountprice+prod.getQuantity()*prod.getPrice();
        }
        System.out.println("Total Discount Price:"+discountprice);
        System.out.println("Total UnDiscount Price:"+undiscountprice);
    }

}
