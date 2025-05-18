package l_12_snake_n_ladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Player winner;
    Deque<Player> playersList = new LinkedList<>();

    public Game() {
        initilaizeGame();
    }

    private void initilaizeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {

        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);

        playersList.add(player1);
        playersList.add(player2);

    }

    public void startGame() {
        while (winner == null) {
            Player playerTurn = findPlayersTurn();
            System.out.println("Player turn is : " + playerTurn.id + " current position is: " + playerTurn.currPos);

            int diceNumber = dice.rollDice();

            int playerNewPosition = diceNumber + playerTurn.currPos;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currPos = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
            }
        }

        System.out.println("WINNER IS:" + winner.id);
    }

    private Player findPlayersTurn() {
        Player playerTurn = playersList.removeFirst();
        playersList.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int playerNewPosition) {

        if (playerNewPosition > board.cells.length * board.cells.length - 1) {
            return  playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);

        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end) ? "Ladder" : "Snake";
            System.out.println("Jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

}
