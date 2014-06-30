package net.kammerath.examples;

import java.util.function.Function;

public class JustSomething {

	public static <T> Function<T, String> SomeMethod() {
        // Goodbye, finally
        return (name) -> "Hello " + name;
    }
	
	
	public void hi() {}
}
