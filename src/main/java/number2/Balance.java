package number2;

public class Balance {
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addRight(int weight) {
        this.rightWeight += weight;
    }

    public void addLeft(int weight) {
        this.leftWeight += weight;
    }

    public char result() {
        if (this.leftWeight == this.rightWeight) {
            return '=';
        } else if (this.rightWeight > this.leftWeight) {
            return 'R';
        } else {
            return 'L';
        }
    }
}