/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.commands;

import yahtzee.Game;
import yahtzee.Scoreboard;
import yahtzee.commands.Command;
import yahtzee.rules.Rule;

/**
 *
 * @author Marc
 */
public class PrintScoreboardCommand extends Command {
    private Game game;

    public PrintScoreboardCommand(Game game) {
        super("print");
        this.game = game;
    }

    @Override
    public void execute(String string) {
     if (game.isRunning()){
              Scoreboard scoreboard = game.getCurrentPlayer().getScoreboard();
     for (Rule rule: scoreboard.getScores().keySet()){
         System.out.println(rule.toString() + " " + scoreboard.getScores().get(rule));
     }
     }else {
         System.out.println("Start a game to get the Scores");
     }

    }
    
}
