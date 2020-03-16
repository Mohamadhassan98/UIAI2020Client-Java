package model.cell;

import model.Position;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ExitLand extends Cell {

    private ExitLand() {
        super(new Position(-1, -1), List.of());
    }

    @NotNull
    private static final ExitLand instance = new ExitLand();

    @NotNull
    public static ExitLand getInstance() {
        return instance;
    }
}
