package factory.impl;

import factory.Furniture;
import product.Chair;
import product.Desk;
import product.impl.VictorianChair;
import product.impl.VictorianDesk;

public class VictorianFurniture implements Furniture {
    @Override
    public Desk createDesk() {
        return new VictorianDesk();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
