package factory;

import product.Chair;
import product.Desk;

public interface Furniture {
    Desk createDesk();
    Chair createChair();
}
