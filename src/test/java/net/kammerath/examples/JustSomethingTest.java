package net.kammerath.examples;

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
	
	@Test
	public void testSomeMethodWithTypedParameter() {
		// inferred as String
		assertEquals(JustSomething.SomeMethod().apply("World!"), "Hello World!");
		// inferred as Integer
		assertEquals(JustSomething.SomeMethod().apply(1), "Hello 1");
		// inferred as Object
		Object obj = new Object();
		assertEquals(JustSomething.SomeMethod().apply(obj), "Hello "+obj);
	}
}
