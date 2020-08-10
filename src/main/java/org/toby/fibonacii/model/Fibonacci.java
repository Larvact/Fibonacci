package org.toby.fibonacii.model;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> fibonacciSequence;
    private long fibonacciNumberUpperBound;

    public Fibonacci(long fibonacciNumberUpperBound) {
        setFibonacciSequence(fibonacciNumberUpperBound);
    }

    public List<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }

    public void setFibonacciSequence(long numberUpperBound) {
        if(numberUpperBound < 1){
            throw new IllegalArgumentException("the number upperbound for a Fibonacci Sequence element must be greater than 0");
        }
        this.fibonacciNumberUpperBound = numberUpperBound;
        this.setFibonacciSequence();
    }

    public long getNext(){
        int numberBeforeLast = fibonacciSequence.get(fibonacciSequence.size() - 2);
        int lastNumber = fibonacciSequence.get(fibonacciSequence.size() - 1);
        return numberBeforeLast + lastNumber;
    }
    public long getSum(){
        long sum = 0;
        for(long number : fibonacciSequence){
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sequenceBuilder = new StringBuilder();
        sequenceBuilder.append("The Fibonacci Sequence is : ");
        sequenceBuilder.append(fibonacciSequence.get(0));
        for(int index = 1; index < fibonacciSequence.size(); index++){
            sequenceBuilder.append(", ").append(fibonacciSequence.get(index));
        }
        return sequenceBuilder.toString();
    }

    private void setFibonacciSequence() {
        initialiseFibonacciSequence();
        int newNumberEntry = 1 + 1;
        while (newNumberEntry < fibonacciNumberUpperBound){
            fibonacciSequence.add(newNumberEntry);
            int numberBeforeLast = fibonacciSequence.get(fibonacciSequence.size() - 2);
            int lastNumber = fibonacciSequence.get(fibonacciSequence.size() - 1);
            newNumberEntry = numberBeforeLast + lastNumber;
        }
    }
    private void initialiseFibonacciSequence(){
        int firstNumber = 1;
        int secondNumber = 1;
        fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(firstNumber);
        fibonacciSequence.add(secondNumber);
    }
}
