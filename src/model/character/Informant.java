package model.character;

import model.cell.Cell;
import model.cell.LibertyIsland;
import org.jetbrains.annotations.NotNull;
import utils.temp.annotations.ServerSetter;

public class Informant {

    private Informant() {
    }

    @ServerSetter
    @NotNull
    private Cell cell = LibertyIsland.getInstance();

    @NotNull
    public Cell getCell() {
        return cell;
    }

    @ServerSetter
    private boolean mute = false;

    public boolean isMute() {
        return mute;
    }

    public boolean isTalkative() {
        return !mute;
    }

    @NotNull
    private static final Informant instance = new Informant();

    @NotNull
    public static Informant getInstance() {
        return instance;
    }
}
