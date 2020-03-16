package model.character;

import model.cell.Cell;
import model.cell.StreetSpace;
import org.jetbrains.annotations.NotNull;

public class LewisHowardLatimer extends Character {

    private LewisHowardLatimer(@NotNull Cell cell) {
        super(cell, true);
    }

    public void installGasLamp(@NotNull StreetSpace cell) {

    }

    @NotNull
    private static final LewisHowardLatimer instance = new LewisHowardLatimer(null);

    @NotNull
    public static LewisHowardLatimer getInstance() {
        return instance;
    }
}