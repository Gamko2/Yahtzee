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
public class AddPlayerCommand extends Command {

    private Game game;
    private String string;

    public AddPlayerCommand(Game game) {
        super("addPlayer");
        this.game = game;
        this.string = string;
    }

    @Override
    public void execute(String string) {
        if (!game.isRunning()) {
            String[] tmp = string.split(" ");
            game.addPlayer(tmp[1]);
            System.out.println("Successfully added player " + tmp[1]);
        } else {
            System.out.println("Can't add players while the game is running");
        }
    }

}
