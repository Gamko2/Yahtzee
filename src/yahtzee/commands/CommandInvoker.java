/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.commands;

import yahtzee.commands.Command;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class CommandInvoker {

    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand(String string) {
        Command command = getCommand(string);
        if (command!= null){
            command.execute(string);
        }else {
            System.out.println("Invalid Command");
        }
    }

    private Command getCommand(String string) {
        String[] words = string.split(" ");
        for (Command command : commands) {
            if (words[0].equals(command.getName()) ) {
                return command;
            }
        }
        return null;
    }

}
