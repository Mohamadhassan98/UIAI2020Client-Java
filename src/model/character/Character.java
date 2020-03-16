package model.character;

import model.cell.Cell;
import org.jetbrains.annotations.NotNull;
import utils.temp.annotations.ServerSetter;

public abstract class Character {

    public Character(@NotNull Cell cell, boolean visible) {
        this.cell = cell;
        this.visible = visible;
    }

    @ServerSetter
    @NotNull
    private Cell cell;

    @ServerSetter
    private boolean visible;

    @ServerSetter
    private boolean suspect = true;

    public boolean isSuspect() {
        return suspect;
    }

    public boolean isInnocent() {
        return !suspect;
    }

    @NotNull
    public Cell getCell() {
        return cell;
    }

    public boolean isVisible() {
        return visible;
    }

    public void moveTo(@NotNull Cell cell) {

    }
}
