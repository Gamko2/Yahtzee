/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.commands;

import yahtzee.Yahtzee;
import yahtzee.commands.Command;

/**
 *
 * @author Marc
 */
public class ExitCommand extends Command {
    private Yahtzee consoleApp;

    public ExitCommand(Yahtzee consoleApp) {
        super("exit");
        this.consoleApp = consoleApp;
    }

    @Override
    public void execute(String string) {
        System.out.println("Thanks for playing Yahtzee");  
        consoleApp.stopRunning();
    }

}
