
package jivetests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ecudhap
 */
public class Tot extends Piece{

    Tot(String name, String color) {
        super(name, color);
    }

    @Override
    public Position isValidMove(Board board, Position curPos, Position nextPos) {
        Piece curPiece = board.getPiece(curPos);
        Piece nextPiece = board.getPiece(nextPos);

        if (nextPiece == null || nextPiece.getColor() != curPiece.getColor()) {
            return nextPos;
        }
        return null;
    }

    @Override
    public List<Position> getValidMoves(Board board, Position curPos) {
        List<Position> validMoves = new ArrayList();
        //move up
        Position upPosition = new Position(curPos.getX(), curPos.getY()+1);
        if (isValidMove(board, curPos, upPosition) != null) {
            validMoves.add(upPosition);
        }
        //move down
        Position downPosition = new Position(curPos.getX(), curPos.getY()-1);
        if (isValidMove(board, curPos, downPosition) != null) {
            validMoves.add(downPosition);
        }
        //move left
        Position leftPosition = new Position(curPos.getX()-1, curPos.getY()+1);
        if (isValidMove(board, curPos, leftPosition) != null) {
            validMoves.add(leftPosition);
        }
        //move right
        Position rightPosition = new Position(curPos.getX()+1, curPos.getY()+1);
        if (isValidMove(board, curPos, rightPosition) != null) {
            validMoves.add(rightPosition);
        }
        return  validMoves;
    }
}
