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
public class UnlockDiceCommand extends Command {
    private Game game;

    public UnlockDiceCommand(Game game) {
        super("unlock");
        this.game = game;
    }

    @Override
    public void execute(String string) {
               String[] words = string.split(" ");
        for (int i = 1; i < words.length; i++) {
            int tmp = Integer.parseInt(words[i]);
            game.unlockDice(tmp - 1);
        } 
    }
    
}
