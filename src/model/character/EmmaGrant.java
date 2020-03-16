package model.character;

import model.cell.Cell;
import model.cell.StreetSpace;
import org.jetbrains.annotations.NotNull;

public class EmmaGrant extends Character {

    private EmmaGrant(@NotNull Cell cell) {
        super(cell, true);
    }

    public void createPark(@NotNull StreetSpace cell) {

    }

    @NotNull
    private static final EmmaGrant instance = new EmmaGrant(null);

    @NotNull
    public static EmmaGrant getInstance() {
        return instance;
    }
}