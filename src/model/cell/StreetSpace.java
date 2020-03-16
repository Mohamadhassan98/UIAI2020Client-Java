package model.cell;

import model.Position;
import model.tile.Tile;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import utils.temp.annotations.ServerSetter;

import java.util.List;

public class StreetSpace extends Cell {

    @ServerSetter
    @Nullable
    private Tile tile;

    @Nullable
    public Tile getTile() {
        return tile;
    }

    private final boolean strictTile;

    public StreetSpace(@NotNull Position position, @NotNull List<Cell> adjacent) {
        this(position, adjacent, false);
    }

    public StreetSpace(@NotNull Position position, @NotNull List<Cell> adjacent, boolean strictTile) {
        super(position, adjacent);
        this.strictTile = strictTile;
    }

    public boolean isStrictTile() {
        return strictTile;
    }
}
