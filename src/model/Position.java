package model;

public class Position {
    private final int column, step;
    public Position(int column, int step) {
        this.column = column;
        this.step = step;
    }

    public int getColumn() {
        return column;
    }

    public int getStep() {
        return step;
    }
}
