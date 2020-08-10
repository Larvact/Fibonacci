package org.toby.fibonacii;

import org.toby.fibonacii.controller.FibonacciManager;

public class Client
{
    public static void main( String[] args )
    {
        FibonacciManager manager = new FibonacciManager(1000);
        manager.printNext();
        manager.printSum();
        manager.printSequence();
    }
}
