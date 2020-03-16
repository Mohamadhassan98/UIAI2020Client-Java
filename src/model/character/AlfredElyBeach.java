package model.character;

import model.cell.Cell;
import model.cell.StreetSpace;
import org.jetbrains.annotations.NotNull;

public class AlfredElyBeach extends Character {

    private AlfredElyBeach(@NotNull Cell cell) {
        super(cell, true);
    }

    public void constructMetroEntrance(@NotNull StreetSpace cell) {
    }

    @NotNull
    private static final AlfredElyBeach instance = new AlfredElyBeach(null);

    @NotNull
    public static AlfredElyBeach getInstance() {
        return instance;
    }
}
