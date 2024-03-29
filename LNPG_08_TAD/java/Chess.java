package LNPG_08_TAD.java;

public class Chess {
    private Piece[][] tray = new Piece[8][8];

    public Chess() {
        for (int i = 0; i < 8; i++) {
            tray[1][i] = new Piece("pawn", "white", new int[] { 1, i });
            tray[6][i] = new Piece("pawn", "black", new int[] { 6, i });
        }
    }

    public Piece[][] getTray() {
        return this.tray;
    }
    
    public void setTray(Piece[][] tray) {
        this.tray = tray;
    }

    public Piece getPiece(int line, int column) {
        return this.tray[line][column];
    }

    public boolean checkCanMove(Piece piece, int line, int column) {
        Piece destinePiece = tray[line][column];
        if (destinePiece == null) {
            return true;
        }
        boolean isFriend = destinePiece.getColor().equals(piece.getColor());
        if (isFriend) {
            return false;
        }
        return true;
    }
    // public static void main(String[] args) {
    //     Chess myChess = new Chess();
    //     Piece myPiece = myChess.getPiece(1, 0);
    //     System.out.println(myChess.checkCanMove(myPiece, 1, 1)); // false cause is friend
    //     System.out.println(myChess.checkCanMove(myPiece, 2, 0)); // true cause is null
    //     System.out.println(myChess.checkCanMove(myPiece, 6, 0)); // true cause is enemy
    // }
}
