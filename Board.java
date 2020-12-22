
package jivetests;

import flex.messaging.io.ArrayCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ecudhap
 */
public class Board {
    public Map<Position, Piece> getBoard() {
        return board;
    }

    private Map<Position, Piece> board = new HashMap();

    public Board() {
        this.board = new HashMap<>();
    }
    public Board(Map<Position, Piece> board) {
        this.board = board;
    }

    public Board cloneBoard() {
        Map<Position, Piece> newBoard = new HashMap();
        for (Position pos : board.keySet()) {
            newBoard.put(pos, board.get(pos));
        }
        return new Board(newBoard);
    }

    public List<Position> getValidMoves(Position position) {
        Piece curPiece = board.get(position);
        return curPiece.getValidMoves(this, position);
    }

    public Board move(Position curPos, Position nextPos) throws Exception{
        Board newBoard = cloneBoard();

        Piece curPiece = getPiece(curPos);
        Piece nextPiece = getPiece(nextPos);

        newBoard.setPiece(curPos, null);
        newBoard.setPiece(nextPos, curPiece);
        return newBoard;
    }

    public void setPiece(Position pos, Piece piece) {
        board.put(pos, piece);
    }
    public Piece getPiece(Position pos) {
        return board.get(pos);
    }

    public void setBoard(Map<Position, Piece> board) {
        this.board = board;
    }

    public void initBoard() {
        board.put(new Position(0,0), new Xe("Xe", "Trang"));
        board.put(new Position(1,0), new Ma("Mã", "Trang"));
        board.put(new Position(2,0), new Tuong("Tuong", "Trang"));
        board.put(new Position(3,0), new Vua("Vua", "Trang"));
        board.put(new Position(4,0), new Hau("Hau", "Trang"));
        board.put(new Position(5,0), new Tuong("Tuong", "Trang"));
        board.put(new Position(6,0), new Ma("Mã", "Trang"));
        board.put(new Position(7,0), new Xe("Xe", "Trang"));

        board.put(new Position(0,1), new Tot("Tot", "Trang"));
        board.put(new Position(1,1), new Tot("Tot", "Trang"));
        board.put(new Position(2,1), new Tot("Tot", "Trang"));
        board.put(new Position(3,1), new Tot("Tot", "Trang"));
        board.put(new Position(4,1), new Tot("Tot", "Trang"));
        board.put(new Position(5,1), new Tot("Tot", "Trang"));
        board.put(new Position(6,1), new Tot("Tot", "Trang"));
        board.put(new Position(7,1), new Tot("Tot", "Trang"));

        board.put(new Position(0,6), new Xe("Xe", "Den"));
        board.put(new Position(1,6), new Ma("Mã", "Den"));
        board.put(new Position(2,6), new Tuong("Tuong", "Den"));
        board.put(new Position(3,6), new Hau("Hau", "Den"));
        board.put(new Position(4,6), new Vua("Vua", "Den"));
        board.put(new Position(5,6), new Tuong("Tuong", "Den"));
        board.put(new Position(6,6), new Ma("Mã", "Den"));
        board.put(new Position(7,6), new Xe("Xe", "Den"));

        board.put(new Position(0,7), new Tot("Tot", "Den"));
        board.put(new Position(1,7), new Tot("Tot", "Den"));
        board.put(new Position(2,7), new Tot("Tot", "Den"));
        board.put(new Position(3,7), new Tot("Tot", "Den"));
        board.put(new Position(4,7), new Tot("Tot", "Den"));
        board.put(new Position(5,7), new Tot("Tot", "Den"));
        board.put(new Position(6,7), new Tot("Tot", "Den"));
        board.put(new Position(7,7), new Tot("Tot", "Den"));
    }
}
