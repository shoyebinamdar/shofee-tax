import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class RegularCustomerTest {

    @Test
    public void getDiscountedAmount() {
        Customer customer = new RegularCustomer(4000);
        Customer customer1 = new RegularCustomer(7000);
        Customer customer2 = new RegularCustomer(10000);
        Customer customer3 = new RegularCustomer(20000);
        Customer customer4 = new RegularCustomer(40000);
        assertEquals(Optional.of(3600), java.util.Optional.ofNullable(customer.getDiscountedAmount()));
        assertEquals(Optional.of(6150), java.util.Optional.ofNullable(customer1.getDiscountedAmount()));
        assertEquals(Optional.of(8600), java.util.Optional.ofNullable(customer2.getDiscountedAmount()));
        assertEquals(Optional.of(16200), java.util.Optional.ofNullable(customer3.getDiscountedAmount()));
        assertEquals(Optional.of(31200), java.util.Optional.ofNullable(customer4.getDiscountedAmount()));
    }
}