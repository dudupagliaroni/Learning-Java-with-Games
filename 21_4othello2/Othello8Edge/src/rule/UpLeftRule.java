/*
 * UpLeftRule.java - A rule that places a piece on the down-right position
 * to flip the opponent pieces on the up-left direction.
 */
package rule;

import java.awt.Color;
import othello.Consts;

/**
 *
 * @author cxu
 */
public class UpLeftRule extends AbsRule {

    private int startRow, startCol;
    private int untilRow, untilCol;

    public UpLeftRule() {
        super();
    }

    @Override
    public boolean isValid(int newRow, int newCol) {
        boolean valid = false;
        Color theColor = getCurPieceColor();
        if (verify(newRow, newCol, theColor)) {
            valid = true;
        }
        return valid;
    }

    public boolean verify(int newRow, int newCol, Color theColor) {
        boolean flag = false;
        if (((newRow - 1) >= 0) && ((newCol - 1) >= 0)
                && ((getPieceBoard())[newRow - 1][newCol - 1] != null)) {
            if (!(pieceBoard[newRow - 1][newCol - 1].getColor().equals(theColor))) {
                //if (getFlipFlag()) {
                    startRow = newRow - 1;
                    startCol = newCol - 1;
                    untilRow = newRow - 1;
                    untilCol = newCol - 1;
                //}
                int row = newRow - 2;
                int col = newCol - 2;
                while ((row >= 0) && (col >= 0)
                        && (pieceBoard[row][col] != null)) {
                    if (pieceBoard[row][col].getColor().equals(theColor)) {
                        //if (getFlipFlag()) {
                            untilRow = row;
                            untilCol = col;
                        //}
                        flag = true;
                        break;
                    } else {
                        row = row - 1;
                        col = col - 1;
                    }
                }
            }
        }
        super.setNumFlip(Math.abs(untilRow - startRow));
        return flag;
    }

    @Override
    public void flipPiece() {
        //if (getFlipFlag()) {
            Color theColor = getCurPieceColor();
            int row = startRow;
            int col = startCol;
            while ((row > untilRow) && (col > untilCol)) {
                pieceBoard[row][col].setFlipStop(false);
                pieceBoard[row][col].setColor(theColor);

                if (theColor.equals(Consts.WHITEP)) {
                    pieceBoard[row][col].setImageIdx(0);
                    pieceBoard[row][col].setNumTurns(6);
                } else if (theColor.equals(Consts.BLACKP)) {
                    pieceBoard[row][col].setImageIdx(6);
                    pieceBoard[row][col].setNumTurns(12);
                }
                row--;
                col--;
            }
        //}
        untilRow = startRow;
        untilCol = startCol;
    }
}
