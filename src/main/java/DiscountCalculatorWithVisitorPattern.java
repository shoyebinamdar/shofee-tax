import java.util.Map;

interface CustomerType {
    Integer accept(DiscountVisitor visitor);
}

interface DiscountVisitor {
    Integer visit(PremiumCustomerType premiumCustomerType);
    Integer visit(RegularCustomerType regularCustomerType);
}

class DiscountVisitorImpl implements DiscountVisitor {

    DiscountCalculator calculator = new DiscountCalculator();

    @Override
    public Integer visit(PremiumCustomerType premiumCustomerType) {
        return calculator.getDiscountedAmount(premiumCustomerType.purchaseAmount, premiumCustomerType.slabs);
    }

    @Override
    public Integer visit(RegularCustomerType regularCustomerType) {
        return calculator.getDiscountedAmount(regularCustomerType.purchaseAmount, regularCustomerType.slabs);
    }
}

class PremiumCustomerType implements CustomerType {

    Integer purchaseAmount;

    Map<Pair, Integer> slabs;

    public PremiumCustomerType(Integer purchaseAmount, Map<Pair, Integer> slabs) {
        this.purchaseAmount = purchaseAmount;
        this.slabs = slabs;
    }

    @Override
    public Integer accept(DiscountVisitor visitor) {
        return visitor.visit(this);
    }
}

class RegularCustomerType implements CustomerType {

    Integer purchaseAmount;

    Map<Pair, Integer> slabs;

    public RegularCustomerType(Integer purchaseAmount, Map<Pair, Integer> slabs) {
        this.purchaseAmount = purchaseAmount;
        this.slabs = slabs;
    }

    @Override
    public Integer accept(DiscountVisitor visitor) {
        return visitor.visit(this);
    }
}

public class DiscountCalculatorWithVisitorPattern {
    public static void main(String[] args) {
        DiscountVisitorImpl visitor = new DiscountVisitorImpl();

        CustomerType premiumCustomer = new PremiumCustomerType(7000, Constants.PREMIUM_SLABS);
        System.out.println(premiumCustomer.accept(visitor));

        CustomerType regularCustomer = new RegularCustomerType(40000, Constants.REGULAR_SLABS);
        System.out.println(regularCustomer.accept(visitor));
    }
}
