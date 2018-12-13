import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class CartTest {

    private Cart cart;
    private LineItem lineItem;
    private Products product;

    @Test
    public void CanCreateAnEmptyShoppingCart() {
        System.out.println("First Test Case:"+cart.getProductByProductID(1));
        assertEquals(lineItem, cart.getProductByProductID(1));
    }


    @Test
    public void CartPrint()
    {
        System.out.println("Second Test Case:");
    }
}
