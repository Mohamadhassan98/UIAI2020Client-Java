package utils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Graph<T> {

    private int nodeCount;

    public int getNodeCount() {
        return nodeCount;
    }

    @NotNull
    private final Map<T, List<T>> adjacencyList = new HashMap<>();

    @NotNull
    public Map<T, List<T>> getAdjacencyList() {
        return adjacencyList;
    }

    @NotNull
    private final List<T> blockedList = new ArrayList<>();

    @NotNull
    public List<T> getBlockedList() {
        return blockedList;
    }

    public void updateAdjacent(T t, List<T> adjacent) {

    }

    public void addToBlocked(T t) {

    }

    public void removeFromBlocked(T t) {

    }

    public void bfs(T t, int maxDepth, Consumer<T> action) {

    }

    public void bfs(T t, int maxDepth) {
        bfs(t, maxDepth, ignored -> {});
    }
}