package model.character;

import model.cell.Cell;
import model.cell.PortSpace;
import org.jetbrains.annotations.NotNull;

public class EdwardSmith extends Character {

    private EdwardSmith(@NotNull Cell cell) {
        super(cell, true);
    }

    public void moveSteamer(PortSpace from, PortSpace to) {

    }

    @NotNull
    private static final EdwardSmith instance = new EdwardSmith(null);

    @NotNull
    public static EdwardSmith getInstance() {
        return instance;
    }
}