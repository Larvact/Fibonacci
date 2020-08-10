package org.toby.fibonacii.view;

import org.toby.fibonacii.controller.FibonacciManager;

public class View {

    private FibonacciManager manager;

    public View(FibonacciManager manager) {
        this.manager = manager;
    }

    public void printSum(){
        String sum = String.format("The Sum of the Finonacci Sequence is: %d", manager.getFibinacci().getSum());
        System.out.println(sum);
    }

    public void printNext(){
        String next = String.format("The Next Number of the Finonacci Sequence is: %d", manager.getFibinacci().getNext());
        System.out.println(next);
    }

    public void printSequence(){
        String sequence = manager.getFibinacci().getFibonacciSequence().toString();
        System.out.println(sequence);
    }
}
