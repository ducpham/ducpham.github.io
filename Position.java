

package jivetests;

/**
 * @author ecudhap
 */
public class Position {
    private int x;
    private int y;

    public Position(int xPos, int yPos) {
        x = xPos;
        y = yPos;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}