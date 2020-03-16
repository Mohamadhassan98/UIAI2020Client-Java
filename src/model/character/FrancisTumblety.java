package model.character;

import model.cell.Cell;
import org.jetbrains.annotations.NotNull;

public class FrancisTumblety extends Character {

    private FrancisTumblety(@NotNull Cell cell) {
        super(cell, false);
    }

    public void hypnotize(@NotNull Character adjacent, @NotNull Character target) {

    }

    @NotNull
    private static final FrancisTumblety instance = new FrancisTumblety(null);

    @NotNull
    public static FrancisTumblety getInstance() {
        return instance;
    }
}