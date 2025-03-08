package number4;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public OddEvenSeparator() {
        this.evenNumbers = new ArrayList<>();
        this.oddNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            this.evenNumbers.add(number);
        } else {
            this.oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Even numbers: " + this.evenNumbers);
    }

    public void odd() {
        System.out.println("Odd numbers: " + this.oddNumbers);
    }
}