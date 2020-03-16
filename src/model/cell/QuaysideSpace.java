package model.cell;

import model.Position;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class QuaysideSpace extends Cell {
    private QuaysideSpace(@NotNull Position position, @NotNull List<Cell> adjacent) {
        super(position, adjacent);
    }

    @NotNull
    private static final QuaysideSpace quaysideSpace1 = new QuaysideSpace(null, null);
    @NotNull
    private static final QuaysideSpace quaysideSpace2 = new QuaysideSpace(null, null);
    @NotNull
    private static final QuaysideSpace quaysideSpace3 = new QuaysideSpace(null, null);
    @NotNull
    private static final QuaysideSpace quaysideSpace4 = new QuaysideSpace(null, null);

    @NotNull
    public static QuaysideSpace getQuaysideSpace1() {
        return quaysideSpace1;
    }

    @NotNull
    public static QuaysideSpace getQuaysideSpace2() {
        return quaysideSpace2;
    }

    @NotNull
    public static QuaysideSpace getQuaysideSpace3() {
        return quaysideSpace3;
    }

    @NotNull
    public static QuaysideSpace getQuaysideSpace4() {
        return quaysideSpace4;
    }

}
