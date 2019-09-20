import java.util.Map;

public class PremiumCustomer implements Customer {
    Integer pusrchaseAmount;

    DiscountCalculator calculator = new DiscountCalculator();

    public PremiumCustomer(Integer pusrchaseAmount) {
        this.pusrchaseAmount = pusrchaseAmount;
    }

    @Override
    public Integer getDiscountedAmount() {
        return calculator.getDiscountedAmount(pusrchaseAmount, Constants.PREMIUM_SLABS);
    }
}
