import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JustSomethingTest {

    @Test
    public void testSomeMethod() {
        assertEquals(JustSomething.SomeMethod().apply("World!"), "Hello World!");
    }

}
