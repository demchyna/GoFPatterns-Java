package decorator;

import source.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
