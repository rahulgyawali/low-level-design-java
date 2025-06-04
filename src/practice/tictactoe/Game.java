package practice.tictactoe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;
    Game(){
        initialize();
    }
    public void initialize(){
        players = new ArrayDeque<>();
        PlayingPiece x = new PlayingPieceX();
        PlayingPiece o = new PlayingPieceO();
        Player playerX = new Player("Player 1",x);
        Player playerO = new Player("Player 2",o);
        players.add(playerX);
        players.add(playerO);
        board = new Board(3);
    }

    public void startGame(){
        while(true){
            if(!board.isFree()){
                System.out.println("Tie");
                break;
            }

            //Current Player
            Player player = players.removeFirst();
            //Print State
            board.print();
            //Take input
            System.out.println("Turn for player "+player.name+" Mark "+player.playingPiece.type.name());
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] coord = input.split(",");
            int row = Integer.parseInt(coord[0]);
            int col = Integer.parseInt(coord[1]);
            //Add and Validate move
            if(!board.move(row,col,player.getPlayingPiece())){
                System.out.println("Enter correct val");
                players.addFirst(player);
                continue;
            }
            //All current to last
            players.addLast(player);
            //Check Winner
            if(board.isWinner(row,col,player.getPlayingPiece())){
                System.out.println("Winner is "+player.name+" with piece "+player.playingPiece.type.name());
                break;
            }
        }
    }
}
