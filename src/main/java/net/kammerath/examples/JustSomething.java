package net.kammerath.examples;

import java.util.function.Function;

public class JustSomething {

	public static <T> Function<T, String> SomeMethod() {
		return (name) -> {
			return "Hello " + name;
		};
	}
}
