package factory.impl;

import factory.Furniture;
import product.Chair;
import product.Desk;
import product.impl.ModernChair;
import product.impl.ModernDesk;

public class ModernFurniture implements Furniture {
    @Override
    public Desk createDesk() {
        return new ModernDesk();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
