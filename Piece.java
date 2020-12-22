
package jivetests;

import java.util.List;

/**
 * @author ecudhap
 */
public abstract class Piece {

    Piece (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public abstract Position isValidMove(Board board, Position curPos, Position nextPos);
    public abstract List<Position> getValidMoves(Board board, Position curPos);
}
