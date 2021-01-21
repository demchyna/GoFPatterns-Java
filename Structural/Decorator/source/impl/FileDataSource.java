package source.impl;

import source.DataSource;

public class FileDataSource implements DataSource {
    @Override
    public void write(String data) {
        System.out.println("Write text to file.");
    }

    @Override
    public String read() {
        System.out.println("Read text from file.");
        return "Some data";
    }
}
