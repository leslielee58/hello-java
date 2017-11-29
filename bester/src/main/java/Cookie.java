/**
 * @author Leslie Lee
 * Created On 2017-11-29
 */
public class Cookie implements Comparable<Cookie> {
    private final int chocolates;

    public Cookie(final int chocolates) {
        this.chocolates = chocolates;
    }

    @Override
    public int compareTo(Cookie other) {
        return this.chocolates - other.chocolates;
    }
}
