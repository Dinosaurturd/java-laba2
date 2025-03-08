package number5;

import java.util.Arrays;

public class Table {
    private int[][] data;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return this.data[row][col];
    }

    public void setValue(int row, int col, int value) {
        this.data[row][col] = value;
    }

    public int rows() {
        return this.rows;
    }

    public int cols() {
        return this.cols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.rows; i++) {
            sb.append(Arrays.toString(this.data[i])).append("\n");
        }
        return sb.toString();
    }

    public double average() {
        if (this.rows == 0 || this.cols == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                sum += this.data[i][j];
            }
        }
        return sum / (double) (this.rows * this.cols);
    }
}
