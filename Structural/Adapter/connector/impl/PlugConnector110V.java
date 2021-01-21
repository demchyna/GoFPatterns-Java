package connector.impl;

import connector.USAPlugConnector;

public class PlugConnector110V implements USAPlugConnector {
    @Override
    public void provideElectricity() {
        System.out.println("The output voltage is 110 volts.");

    }
}
