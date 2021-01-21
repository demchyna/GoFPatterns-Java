package connector.impl;

import connector.EURPlugConnector;

public class PlugConnector220V implements EURPlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("The output voltage is 220 volts.");
    }
}
