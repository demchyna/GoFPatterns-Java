package adapter;

import connector.EURPlugConnector;
import connector.USAPlugConnector;

public class From220To110Adapter implements EURPlugConnector {
     private final USAPlugConnector plugConnector;

    public From220To110Adapter(USAPlugConnector plugConnector) {
        this.plugConnector = plugConnector;
    }

    @Override
    public void giveElectricity() {
        plugConnector.provideElectricity();
    }
}
