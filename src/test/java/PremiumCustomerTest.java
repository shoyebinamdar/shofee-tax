import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PremiumCustomerTest {

    @Test
    public void getDiscountedAmount() {
        Customer customer = new PremiumCustomer(5000);
        Customer customer1 = new PremiumCustomer(7000);
        Customer customer2 = new PremiumCustomer(10000);
        Customer customer3 = new PremiumCustomer(20000);
        assertEquals(Optional.of(5000), java.util.Optional.ofNullable(customer.getDiscountedAmount()));
        assertEquals(Optional.of(6800), java.util.Optional.ofNullable(customer1.getDiscountedAmount()));
        assertEquals(Optional.of(9500), java.util.Optional.ofNullable(customer2.getDiscountedAmount()));
        assertEquals(Optional.of(17500), java.util.Optional.ofNullable(customer3.getDiscountedAmount()));
    }

}