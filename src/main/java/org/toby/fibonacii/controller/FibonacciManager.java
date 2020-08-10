package org.toby.fibonacii.controller;

import org.toby.fibonacii.model.Fibonacci;
import org.toby.fibonacii.view.FibonacciView;

public class FibonacciManager {

    private long numberUpperBound;
    private Fibonacci fibonacci;
    private FibonacciView view;

    public FibonacciManager(long numberUpperBound) {
        this.numberUpperBound = numberUpperBound;
        fibonacci = new Fibonacci(this.numberUpperBound);
        view = new FibonacciView(this.fibonacci);
    }

    public void printSum(){
        view.printSum();
    }

    public void printNext(){
        view.printNext();
    }

    public void printSequence(){
        view.printSequence();
    }
}
