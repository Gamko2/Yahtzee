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
public class RollCommand extends Command {

    private Game game;

    public RollCommand(Game game) {
        super("roll");
        this.game = game;
    }

    @Override
    public void execute(String string) {
        if (game.isRunning()) {
            if (game.getNumberOfRolls() < 200) {
                game.rollDices();
                game.getDicebox().displayRolls();
            } else {
                System.out.println("You exceeded the maximum number of allowed rolls!");
            }
        } else {
            System.out.println("You need to start a game before rolling!");
        }

    }

}
