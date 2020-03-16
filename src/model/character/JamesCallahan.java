package model.character;

import model.cell.Cell;
import model.cell.StreetSpace;
import model.tile.InvestigationTile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class JamesCallahan extends Character {

    private JamesCallahan(@NotNull Cell cell) {
        super(cell, true);
    }

    public void moveInvestigationTile(@NotNull InvestigationTile tile, @NotNull Map.Entry<@Nullable StreetSpace, @Nullable StreetSpace> to) {

    }

    @NotNull
    private static final JamesCallahan instance = new JamesCallahan(null);

    @NotNull
    public static JamesCallahan getInstance() {
        return instance;
    }
}