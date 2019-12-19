package always.javabase.lambda;

@FunctionalInterface
public interface supplier<T> {
    T get();
}
