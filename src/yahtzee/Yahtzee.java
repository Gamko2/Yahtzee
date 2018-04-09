/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import yahtzee.commands.UnlockDiceCommand;
import yahtzee.commands.WritePointsCommand;
import yahtzee.commands.StartGameCommand;
import yahtzee.commands.RollCommand;
import yahtzee.commands.PrintScoreboardCommand;
import yahtzee.commands.LockDiceCommand;
import yahtzee.commands.ExitCommand;
import yahtzee.commands.AddPlayerCommand;
import yahtzee.commands.EndGameCommand;
import yahtzee.commands.CommandInvoker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author Marc
 */
public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    boolean running = true;
     
    public void stopRunning(){
        running = false;
    }
     public void runGame() throws IOException{
        System.out.println("Welcome to Yahtzee");
        Game game = new Game();
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(new ExitCommand(this));
        commandInvoker.addCommand(new AddPlayerCommand(game));
        commandInvoker.addCommand(new StartGameCommand(game));
        commandInvoker.addCommand(new EndGameCommand(game));
        commandInvoker.addCommand(new RollCommand(game));
        commandInvoker.addCommand(new LockDiceCommand(game));
        commandInvoker.addCommand(new UnlockDiceCommand(game));
        commandInvoker.addCommand(new PrintScoreboardCommand(game));
        commandInvoker.addCommand(new WritePointsCommand(game));
           while (running) {
            if (game.getCurrentPlayer() != null && game.isRunning()){
            System.out.println("Enter your command " + game.getCurrentPlayer().getName());    
            }else {
                System.out.println("Enter your command");
            }
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            commandInvoker.executeCommand(input);
            
        }   
     }
    
    
    public static void main(String[] args) throws IOException {
       Yahtzee yahtzee = new Yahtzee();
       yahtzee.runGame();
        
        
        
        
        
        

   
    }

}
