import adapter.From220To110Adapter;
import connector.impl.PlugConnector110V;
import connector.impl.PlugConnector220V;
import socket.ElectricalSocket220V;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        ElectricalSocket220V electricalSocket220V = new ElectricalSocket220V();

        PlugConnector220V plugConnector220V = new PlugConnector220V();
        electricalSocket220V.plugIn(plugConnector220V);

        PlugConnector110V plugConnector110V = new PlugConnector110V();
        //electricalSocket220V.plugIn(plugConnector110V);

        From220To110Adapter adapter = new From220To110Adapter(plugConnector110V);
        electricalSocket220V.plugIn(adapter);

    }
}
