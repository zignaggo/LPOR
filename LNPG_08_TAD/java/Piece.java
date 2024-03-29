package LNPG_08_TAD.java;

import java.util.ArrayList;
public class Piece {
    private String type;
    private String color;
    private int[] position = new int[2];
    private ArrayList<Piece> catchedPieces = new ArrayList<>();

    public Piece(String type, String color, int[] position) {
        this.type = type;
        this.color = color;
        this.position = position;
    }

    public int[] getPosition() {
        return this.position;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }

    public void move(int line, int column) {
        this.position[0] = line;
        this.position[1] = column;
    }

    public void catchPiece(Piece enemyPiece) {
        this.catchedPieces.add(enemyPiece);
    }

    public String getInfo() {
        return String.format("Type: %s\nColor: %s\nPosition: %dx%d", this.type, this.color, this.position[0],
                this.position[1]);
    }

    public ArrayList<Piece> getCatchedPieces() {
        return catchedPieces;
    }

    @Override
    public String toString() {
        return this.getInfo();
    }
   
}
