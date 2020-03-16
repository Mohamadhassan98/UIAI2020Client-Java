package model.cell;

import model.Position;
import model.character.Character;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import utils.temp.annotations.ServerSetter;

import java.util.List;

public abstract class Cell {
    @NotNull
    private final Position position;
    @NotNull
    private final List<@NotNull Cell> adjacent;

    @Nullable
    @ServerSetter
    private Character character;

    @NotNull
    public Position getPosition() {
        return position;
    }

    @NotNull
    public Cell getAdjacent(int index) {
        return adjacent.get(index);
    }

    @Nullable
    public Character getCharacter() {
        return character;
    }

    public Cell(@NotNull Position position, @NotNull List<Cell> adjacent) {
        this.position = position;
        this.adjacent = adjacent;
    }

    public Cell(@NotNull Position position) {
        this(position, List.of());
    }
}


