/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

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
           while (running) {
            System.out.println("Enter your command");
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
