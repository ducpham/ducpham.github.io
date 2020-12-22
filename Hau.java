

package jivetests;

import java.util.List;

/**
 * @author ecudhap
 */
public class Hau extends Piece{

    Hau(String name, String color) {
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
