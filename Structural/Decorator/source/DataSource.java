package source;

public interface DataSource {
    void write(String data);
    String read();
}
