package org.toby.fibonacii.view;


import org.toby.fibonacii.model.Fibonacci;

public class FibonacciView {

    private Fibonacci fibonacci;

    public FibonacciView(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    public void printSum(){
        String sum = String.format("The Sum of the Finonacci Sequence is: %d", fibonacci.getSum());
        System.out.println(sum);
    }

    public void printNext(){
        String next = String.format("The Next Number of the Finonacci Sequence is: %d", fibonacci.getNext());
        System.out.println(next);
    }

    public void printSequence(){
        String sequence = fibonacci.toString();
        System.out.println(sequence);
    }
}
