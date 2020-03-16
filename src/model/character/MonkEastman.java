package model.character;

import model.cell.Cell;
import org.jetbrains.annotations.NotNull;

public class MonkEastman extends Character {
    private MonkEastman(@NotNull Cell cell) {
        super(cell, false);
    }

    public void moveAnotherCharacter(@NotNull Character character, @NotNull Cell to) {
    }

    @NotNull
    private static final MonkEastman instance = new MonkEastman(null);

    @NotNull
    public static MonkEastman getInstance() {
        return instance;
    }
}
