package model.character;

import model.cell.Cell;
import model.cell.StreetSpace;
import org.jetbrains.annotations.NotNull;

public class CloudRider extends Character {

    private CloudRider(@NotNull Cell cell) {
        super(cell, true);
    }

    public void constructBuildingSite(@NotNull StreetSpace cell) {
    }

    @Override
    public void moveTo(@NotNull Cell cell) {
        super.moveTo(cell);
    }

    @NotNull
    private static final CloudRider instance = new CloudRider(null);

    @NotNull
    public static CloudRider getInstance() {
        return instance;
    }
}
