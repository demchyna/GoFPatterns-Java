package decorator;

import source.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    private String encode(String data) {
        System.out.println("Encode text.");
        return "Some encoded data";
    }

    private String decode(String data) {
        System.out.println("Decode text.");
        return "Some decoded data";
    }
}
