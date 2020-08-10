package org.toby.fibonacii.modeltest;

import org.junit.Assert;
import org.junit.Test;
import org.toby.fibonacii.model.Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTester {

    private final long sizeOfFibonacciSequence = 10;
    private final long fibonacciNumberUpperbound = 60;
    private final long nextFibonacciNumber = 89;
    private final long fibinacciSequenceSum = 143;
    private List<Integer> first10FibonacciNumbers;
    private Fibonacci fibonacci;

    public FibonacciTester() {
        setFibonacciSequenceForFirst10Numbers();
        fibonacci = new Fibonacci(fibonacciNumberUpperbound);
    }

    @Test
    public void ensureFibonacciListIsTheCorrectSize(){
        Assert.assertEquals(sizeOfFibonacciSequence, fibonacci.getSequence().size());
    }

    @Test
    public void ensureFibonacciListIsCorrectForSize10(){
        Assert.assertEquals(first10FibonacciNumbers, fibonacci.getSequence());
    }

    @Test
    public void ensureGetNextOutputIsTheCorrectNextFibonacciNumber(){
        Assert.assertEquals(fibonacci.getNext(), nextFibonacciNumber);
    }

    @Test
    public void ensureSumOfFibonacciSequenceIsCorrect(){
        Assert.assertEquals(fibonacci.getSum(), fibinacciSequenceSum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureExceptionIsRaisedOnInvalidNumberUpperBoundInput(){
        Fibonacci invalidFibonacci = new Fibonacci(0);
    }

    private void setFibonacciSequenceForFirst10Numbers(){
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(1);
        fibSequence.add(1);
        fibSequence.add(2);
        fibSequence.add(3);
        fibSequence.add(5);
        fibSequence.add(8);
        fibSequence.add(13);
        fibSequence.add(21);
        fibSequence.add(34);
        fibSequence.add(55);
        first10FibonacciNumbers = fibSequence;
    }
}
