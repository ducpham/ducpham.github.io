

package jivetests;

import java.util.List;

/**
 * @author ecudhap
 */
public class Tuong extends Piece{

    Tuong(String name, String color) {
        super(name, color);
    }

    @Override
    public Position isValidMove(Board board, Position curPos, Position nextPos) {
        return null;
    }

    @Override
    public List<Position> getValidMoves(Board board, Position curPos) {
        return null;
    }
}
