/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.List;

/**
 *
 * @author Marc
 */
public class WritePointsCommand extends Command {

    private Game game;

    public WritePointsCommand(Game game) {
        super("write");
        this.game = game;
    }

    @Override
    public void execute(String string) {
        int i = string.indexOf(" ");
        String substring = string.substring(i + 1);
        Rule[] tmp = game.getCurrentPlayer().getScoreboard().availableFields();

        for (Rule rule : tmp) {
            if (rule.getName().equals(substring)) {
                game.writePoints(rule);
                return;
            }
        }
        System.out.println("Can't write points to that rule");

    }

}
