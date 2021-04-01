package converter;

@FunctionalInterface
public interface Observer {
    void update(int state);
}
