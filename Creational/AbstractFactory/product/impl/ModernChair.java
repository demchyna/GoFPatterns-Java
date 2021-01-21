package product.impl;

import product.Chair;

public class ModernChair implements Chair {
    @Override
    public void info() {
        System.out.println("Chair in 'modern' style.");
    }
}
