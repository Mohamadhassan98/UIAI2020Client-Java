package model.tile;

import model.cell.Cell;

import java.util.ArrayList;
import java.util.List;

public enum Tile {
    BuildingSite, MetroEntrance, GasLamp, Park;

    private final List<Cell> cells = new ArrayList<>();

    public List<Cell> getCells() {
        return cells;
    }
}
