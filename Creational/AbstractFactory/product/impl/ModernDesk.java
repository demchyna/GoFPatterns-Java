package product.impl;

import product.Desk;

public class ModernDesk implements Desk {
    @Override
    public void info() {
        System.out.println("Desk in 'modern' style.");
    }
}
