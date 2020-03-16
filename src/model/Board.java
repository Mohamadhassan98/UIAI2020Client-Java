package model;

import model.cell.Cell;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Board {

    private Board() {
    }

    @NotNull
    private Map<@NotNull Position, @NotNull Cell> map = Map.of();

}
