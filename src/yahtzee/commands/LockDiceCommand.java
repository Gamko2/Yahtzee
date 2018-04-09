/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.commands;

import yahtzee.Game;
import yahtzee.commands.Command;

/**
 *
 * @author Marc
 */
public class LockDiceCommand extends Command {

    private Game game;

    public LockDiceCommand(Game game) {
        super("lock");
        this.game = game;
    }

    @Override
    public void execute(String string) {
        String[] words = string.split(" ");
        for (int i = 1; i < words.length; i++) {
            int tmp = Integer.parseInt(words[i]);
            game.holdDie(tmp - 1);
        }
    }

}
