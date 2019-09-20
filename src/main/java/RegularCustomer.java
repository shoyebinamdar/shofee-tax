import java.util.Map;

public class RegularCustomer implements Customer {
    Integer purchaseAmount;

    DiscountCalculator calculator = new DiscountCalculator();

    public RegularCustomer(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public Integer getDiscountedAmount() {
        return calculator.getDiscountedAmount(purchaseAmount, Constants.REGULAR_SLABS);
    }
}
