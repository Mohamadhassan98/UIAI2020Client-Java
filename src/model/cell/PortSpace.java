package model.cell;

import model.Position;
import org.jetbrains.annotations.NotNull;
import utils.temp.annotations.ServerSetter;

import java.util.List;

public class PortSpace extends Cell {

    private PortSpace(@NotNull Position position, @NotNull List<Cell> adjacent) {
        this(position, adjacent, false);
    }

    private PortSpace(@NotNull Position position, @NotNull List<Cell> adjacent, boolean hasSteamer) {
        super(position, adjacent);
        this.hasSteamer = hasSteamer;
    }

    @ServerSetter
    private boolean hasSteamer;


    public boolean isHasSteamer() {
        return hasSteamer;
    }

    @NotNull
    private static PortSpace portSpace1;
    @NotNull
    private static PortSpace portSpace2;
    @NotNull
    private static PortSpace portSpace3;
    @NotNull
    private static PortSpace portSpace4;
    @NotNull
    private static PortSpace portSpace5;

    @NotNull
    public static PortSpace getPortSpace1() {
        return portSpace1;
    }

    @NotNull
    public static PortSpace getPortSpace2() {
        return portSpace2;
    }

    @NotNull
    public static PortSpace getPortSpace3() {
        return portSpace3;
    }

    @NotNull
    public static PortSpace getPortSpace4() {
        return portSpace4;
    }

    @NotNull
    public static PortSpace getPortSpace5() {
        return portSpace5;
    }
}
