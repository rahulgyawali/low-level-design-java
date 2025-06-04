package practice.tictactoe;

public class Board {

    int size;
    PlayingPiece[][] board;
    int counter;

    Board(int n){
        this.size = n;
        this.board = new PlayingPiece[n][n];
        this.counter = 0;
    }

    public boolean move(int row,int col,PlayingPiece playingPiece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        counter++;
        return true;
    }

    public boolean isFree(){
        return counter < size*size;
    }

    public boolean isWinner(int row, int col, PlayingPiece input){
        boolean diagonal = true;
        boolean antiDiagonla = true;
        boolean rows = true;
        boolean cols = true;
        //column
        for(int i = 0; i < size; i++){
            if(board[i][col] == null || !board[i][col].type.name().equals(input.type.name())){
                cols = false;
                break;
            }
        }
        //row
        for(int i = 0; i < size; i++){
            if(board[row][i] == null || !board[row][i].type.name().equals(input.type.name())){
                rows = false;
                break;
            }
        }
        //Diagonal
        for(int i =0; i < size; i++){
            if(board[i][i] == null || !board[i][i].type.name().equals(input.type.name())){
                diagonal = false;
                break;
            }
        }
        //Anti Diagonal
        for(int i =0,j=size-1; i < size && j >= 0; i++,j--){
            if(board[i][j] == null || !board[i][j].type.name().equals(input.type.name())){
                antiDiagonla = false;
                break;
            }
        }
        return rows || cols || diagonal || antiDiagonla;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                    if(board[i][j] == null){
                        System.out.print("  ");
                    }else {
                        System.out.print(board[i][j].type.name()+" ");
                    }
                    System.out.print("|");
            }
            System.out.println();
        }
    }
}
