package decorator;

import source.DataSource;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    private String compress(String stringData) {
        System.out.println("Compress text.");
        return "Some compressed data";
    }

    private String decompress(String stringData) {
        System.out.println("Decompress text.");
        return "Some decompressed data";
    }
}
