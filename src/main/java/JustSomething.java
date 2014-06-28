import java.util.function.Function;

public class JustSomething {


    public static Function<String, String> SomeMethod() {
        return (name) -> "Hello " + name;
    }
}
