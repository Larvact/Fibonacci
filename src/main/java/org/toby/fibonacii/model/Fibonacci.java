package org.toby.fibonacii.model;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> sequence;
    private long numberUpperBound;

    public Fibonacci(long numberUpperBound) {
        setSequence(numberUpperBound);
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(long numberUpperBound) {
        if(numberUpperBound < 1){
            throw new IllegalArgumentException("the number upperbound for a Fibonacci Sequence element must be greater than 0");
        }
        this.numberUpperBound = numberUpperBound;
        this.setSequence();
    }

    public long getNext(){
        int numberBeforeLast = sequence.get(sequence.size() - 2);
        int lastNumber = sequence.get(sequence.size() - 1);
        return numberBeforeLast + lastNumber;
    }
    public long getSum(){
        long sum = 0;
        for(long number : sequence){
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sequenceBuilder = new StringBuilder();
        sequenceBuilder.append("The Fibonacci Sequence is: ");
        sequenceBuilder.append(sequence.get(0));
        for(int index = 1; index < sequence.size(); index++){
            sequenceBuilder.append(", ").append(sequence.get(index));
        }
        return sequenceBuilder.toString();
    }

    private void setSequence() {
        initialiseSequence();
        int newNumberEntry = 1 + 1;
        while (newNumberEntry < numberUpperBound){
            sequence.add(newNumberEntry);
            int numberBeforeLast = sequence.get(sequence.size() - 2);
            int lastNumber = sequence.get(sequence.size() - 1);
            newNumberEntry = numberBeforeLast + lastNumber;
        }
    }
    private void initialiseSequence(){
        int firstNumber = 1;
        int secondNumber = 1;
        sequence = new ArrayList<>();
        sequence.add(firstNumber);
        sequence.add(secondNumber);
    }
}
