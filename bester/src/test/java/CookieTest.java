import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Leslie Lee
 * Created On 2017-11-29
 */
public class CookieTest {
    private Cookie c1;
    private Cookie c2;
    private Cookie c3;

    @Before
    public void setUp() throws Exception {
        c1 = new Cookie(1);
        c2 = new Cookie(3);
        c3 = new Cookie(5);
    }

    @Test
    public void should_return_better_cookie() throws Exception {
        assertThat(c2.compareTo(c1),is(2));
    }
}
