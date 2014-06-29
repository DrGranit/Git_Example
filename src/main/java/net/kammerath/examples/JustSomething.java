package net.kammerath.examples;

import java.util.function.Function;

public class JustSomething {

    /**
     * Creates a function to prepare a greeting.
     * <b>note:</b><i>Doesn't allow for numbers within the greeting string.</i>
     *
     * @return a "Hello World" function taking two strings
     */
    public static Function<String, String> SomeMethod() {
		return (name) -> {
			if (name.matches(".*\\d.*"))
				throw new IllegalArgumentException(
						"Input string may not contain numeric characters");
			return "Hello " + name;
		};
	}
}
