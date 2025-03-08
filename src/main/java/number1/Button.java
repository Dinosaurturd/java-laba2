package number1;

public class Button {
    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    public void click() {
        this.clickCount++;
        System.out.println("Number of clicks " + this.clickCount);
    }

    public int getClickCount() {
        return this.clickCount;
    }
}