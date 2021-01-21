package product.impl;

import product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void info() {
        System.out.println("Chair in 'victorian' style.");
    }
}
