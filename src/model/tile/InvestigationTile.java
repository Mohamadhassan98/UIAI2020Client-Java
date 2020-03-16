package model.tile;

import model.cell.StreetSpace;
import org.jetbrains.annotations.NotNull;
import utils.temp.annotations.ServerSetter;

import java.util.AbstractMap;
import java.util.Map;

public class InvestigationTile {
    private InvestigationTile() {
    }
    @ServerSetter
    private Map.Entry<@NotNull StreetSpace, @NotNull StreetSpace> blockedCells = new AbstractMap.SimpleEntry<>(null, null);


    public Map.Entry<StreetSpace, StreetSpace> getBlockedCells() {
        return blockedCells;
    }

    @NotNull
    private static InvestigationTile investigationTile1;
    @NotNull
    private static InvestigationTile investigationTile2;

    @NotNull
    public static InvestigationTile getInvestigationTile1() {
        return investigationTile1;
    }

    @NotNull
    public static InvestigationTile getInvestigationTile2() {
        return investigationTile2;
    }
}
