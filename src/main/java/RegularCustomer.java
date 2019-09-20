import java.util.Map;

public class RegularCustomer implements Customer {
    Integer purchaseAmount;

    public RegularCustomer(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public Integer getDiscountedAmount() {

        Integer discountedAmount = 0;

        Integer temp = purchaseAmount;
        for (Map.Entry<Pair, Integer> entry : Constants.REGULAR_SLABS.entrySet()) {

            if (temp > 0) {
                Integer diff = entry.getKey().upperBound - entry.getKey().lowerBound;
                if (temp >= entry.getKey().upperBound) {
                    discountedAmount += diff - (diff * entry.getValue()) / 100;
                }
                else
                    discountedAmount += temp - (temp * entry.getValue()) / 100;

                temp -= diff;
            }
        }

        return discountedAmount;
    }
}
