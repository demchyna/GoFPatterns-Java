package adapter;

import connector.EURPlugConnector;
import connector.USAPlugConnector;
import connector.impl.PlugConnector110V;

public class From220To110Adapter /* extends PlugConnector110V */ implements EURPlugConnector {
     private final USAPlugConnector plugConnector;

    public From220To110Adapter(USAPlugConnector plugConnector) {
        this.plugConnector = plugConnector;
    }

    @Override
    public void giveElectricity() {
        plugConnector.provideElectricity();
//        provideElectricity();
    }
}
