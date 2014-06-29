package net.kammerath.examples;

import java.util.function.Function;

public class JustSomething {

    /**
     * Creates a function to prepare a greeting.
     * 
     * @return a "Hello World" function taking 
	 * any input and returning a strings
     */
	public static <T> Function<T, String> SomeMethod() {
        // Goodbye
        return (name) -> "Hello " + name;
    }
	
	
	public void hi() {}
}
