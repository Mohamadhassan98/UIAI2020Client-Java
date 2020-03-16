package model.cell;

import model.Position;
import org.jetbrains.annotations.NotNull;

public class LibertyIsland extends Cell {
    private LibertyIsland() {
        super(new Position(-1, -1)); // TODO has no adjacent, or if it has, remove the adjacent default
    }

    @NotNull
    private static final LibertyIsland instance = new LibertyIsland();

    @NotNull
    public static LibertyIsland getInstance() {
        return instance;
    }
}
