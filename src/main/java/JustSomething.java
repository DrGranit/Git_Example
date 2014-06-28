import java.util.function.Function;

public class JustSomething {

	public static Function<String, String> SomeMethod() {
		return (name) -> {
			if (name.matches(".*\\d.*"))
				throw new IllegalArgumentException(
						"Input string may not contain numeric characters");
			return "Hello " + name;
		};
	}
}
