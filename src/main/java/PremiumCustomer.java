public class PremiumCustomer implements Customer {
    Integer pusrchaseAmount;

    public PremiumCustomer(Integer pusrchaseAmount) {
        this.pusrchaseAmount = pusrchaseAmount;
    }

    @Override
    public Integer getDiscountedAmount() {
        return null;
    }
}
