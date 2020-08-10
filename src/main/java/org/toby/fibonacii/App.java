package org.toby.fibonacii;

import org.toby.fibonacii.controller.FibonacciManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FibonacciManager manager = new FibonacciManager(1000);
        manager.getFibinacciView().printNext();
        manager.getFibinacciView().printSum();
        manager.getFibinacciView().printSequence();
    }
}
