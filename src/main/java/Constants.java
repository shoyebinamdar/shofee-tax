import java.util.Map;
import java.util.TreeMap;

public class Constants {
    public static Map<Pair, Integer> PREMIUM_SLABS = new TreeMap<Pair, Integer>(){{
        put(new Pair(0, 5000), 0);
        put(new Pair(5000, 10000), 10);
        put(new Pair(10000, Integer.MAX_VALUE), 20);
    }};

    public static Map<Pair, Integer> REGULAR_SLABS = new TreeMap<Pair, Integer>(){{
        put(new Pair(0, 4000), 10);
        put(new Pair(4000,  8000), 15);
        put(new Pair(8000, 12000), 20);
        put(new Pair(12000, Integer.MAX_VALUE), 25);
    }};
}
