import java.util.Map;
import java.util.TreeMap;

public class DiscountCalculator {
    Integer getDiscountedAmount(Integer amount, Map<Pair, Integer> slabs) {
        Integer discountedAmount = 0;
        Integer temp = amount;
        for (Map.Entry<Pair, Integer> entry : slabs.entrySet()) {
            Integer amountForDiscount = 0;
            if (temp > 0) {
                Integer diff = entry.getKey().upperBound - entry.getKey().lowerBound;

                if (temp - diff <= 0){
                    amountForDiscount = temp;
                }
                else {
                    amountForDiscount = diff;
                }

                discountedAmount = discountedAmount + (amountForDiscount * entry.getValue())/100;

                temp = temp - diff;
            }
            else {
                break;
            }
        }
        return amount - discountedAmount;
    }
}
