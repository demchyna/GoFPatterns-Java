package product.impl;

import product.Desk;

public class VictorianDesk implements Desk {
    @Override
    public void info() {
        System.out.println("Desk in 'victorian' style.");
    }
}
