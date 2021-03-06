import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Leslie Lee
 * Created On 2017-11-29
 */
public class RectangleTest {

    private Rectangle r1;
    private Rectangle r2;
    private Rectangle r3;

    @Before
    public void setUp() throws Exception {
        r1 = new Rectangle(4d, 5d);
        r2 = new Rectangle(4d, 10d);
        r3 = new Rectangle(4d, 20d);
    }

    @Test
    public void should_rectangle_be_better_when_height_closer_to_width() throws Exception {
        assertThat(r1.compareTo(r2), is(1));
    }

}
