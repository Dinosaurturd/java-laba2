import number1.Button;
import number2.Balance;
import number3.Bell;
import number4.OddEvenSeparator;
import number5.Table;


public class Main {
    public static void main(String[] args) {
       //1
        Button myButton = new Button();
        myButton.click();
        myButton.click();
        myButton.click();

        System.out.println("Total number of clicks: " + myButton.getClickCount());

        //2

        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        balance.addRight(5);

        System.out.println(balance.result());

        balance.addRight(1);
        System.out.println(balance.result());

        balance.addLeft(10);
        System.out.println(balance.result());

        //3

        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        //4

        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.addNumber(6);

        separator.even();
        separator.odd();

        //5

        Table table = new Table(3, 4);

        System.out.println("Starting table:");
        System.out.println(table);

        table.setValue(0, 0, 1);
        table.setValue(1, 2, 5);
        table.setValue(2, 3, 9);

        System.out.println("Table after setting values:");
        System.out.println(table);

        System.out.println("Value in cell (1, 2): " + table.getValue(1, 2));
        System.out.println("Number of lines: " + table.rows());
        System.out.println("Number of columns: " + table.cols());
        System.out.println("Arithmetic mean: " + table.average());

    }
}