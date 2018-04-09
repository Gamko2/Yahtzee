/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author Marc
 */
public class StartGameCommand extends Command {

    private Game game;

    public StartGameCommand(Game game) {
        super("startGame");
        this.game = game;
    }

    @Override
    public void execute(String string) {
        if (game.getPlayers().size() >= 2 && !game.isRunning()) {
            game.startGame();
            System.out.println("Yahtzee has started. Have fun :)");
           
        } else {
            System.out.println("Please enter at least 2 players before attempting to start a game or don't start the game twice retard");
        }

    }

}
