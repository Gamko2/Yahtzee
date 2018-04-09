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
public class EndGameCommand extends Command {
    private Game game;

    public EndGameCommand(Game game) {
        super("endGame");
        this.game = game;
    }

    @Override
    public void execute(String string) {
        if (game.isRunning()){
            game.isRunning = false;
        }else {
            System.out.println("Can't end a game that hasn't even started friend!");
        }
    }
    
}
