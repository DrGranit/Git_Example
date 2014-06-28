import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JustSomethingTest {

	@Test
	public void testSomeMethod() {
		assertEquals(JustSomething.SomeMethod().apply("World!"), "Hello World!");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumericStringInputNotAccepted() {
		JustSomething.SomeMethod().apply("123");
	}
}
