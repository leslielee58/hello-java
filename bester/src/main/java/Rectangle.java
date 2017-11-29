/**
 * @author Leslie Lee
 * Created On 2017-11-29
 */
public class Rectangle implements Comparable<Rectangle> {
    private final double width;
    private final double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }


    private static double getRate(Rectangle rectangle) {
        return rectangle.height > rectangle.width ? rectangle.width / rectangle.height : rectangle.height / rectangle.width;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getRate(this) - getRate(o) > 0) {
            return 1;
        } else if (getRate(this) - getRate(o) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
