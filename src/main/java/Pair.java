import java.util.Objects;

public class Pair implements Comparable<Pair>{
    Integer lowerBound;
    Integer upperBound;

    public Pair(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return lowerBound.equals(pair.lowerBound) &&
                upperBound.equals(pair.upperBound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerBound, upperBound);
    }

    @Override
    public int compareTo(Pair o) {
        return this.upperBound - o.upperBound;
    }
}
