import decorator.CompressionDecorator;
import decorator.DataSourceDecorator;
import decorator.EncryptionDecorator;
import source.DataSource;
import source.impl.FileDataSource;

import java.io.*;
import java.util.List;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws IOException {
        DataSource dataSource1 = new FileDataSource();
        dataSource1.write("Some data");
        String data1 = dataSource1.read();

        System.out.println();

        DataSource dataSource2 = new DataSourceDecorator(
                new EncryptionDecorator(
                        new CompressionDecorator(dataSource1)));
        dataSource2.write("Some data");
        String data2 = dataSource2.read();


//        BufferedReader bufferedReader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("filename")));
//        bufferedReader.read();
    }
}
