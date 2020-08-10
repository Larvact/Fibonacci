package org.toby.fibonacii.controller;

import org.toby.fibonacii.model.Fibonacci;
import org.toby.fibonacii.view.View;

public class FibonacciManager {

    private long numberUpperBound;
    private Fibonacci fibinacci;
    private View fibinacciView;

    public FibonacciManager(long numberUpperBound) {
        this.numberUpperBound = numberUpperBound;
        fibinacci = new Fibonacci(this.numberUpperBound);
        fibinacciView = new View(this);
    }

    public Fibonacci getFibinacci() {
        return fibinacci;
    }

    public View getFibinacciView() {
        return fibinacciView;
    }
}
