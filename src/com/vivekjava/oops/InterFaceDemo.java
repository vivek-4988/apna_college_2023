package com.vivekjava.oops;

public class InterFaceDemo {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();

        Rook rook= new Rook();
        rook.moves();

    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{

    @Override
    public void moves() {
        System.out.println("Queen moves left , right , up , down, both diagonal(No step limit)");
    }
}


class Rook implements ChessPlayer{

    @Override
    public void moves() {
        System.out.println("Queen moves left , right , up , down, both diagonal(1 step)");
    }
}