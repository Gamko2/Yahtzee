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
public class Player {
    private String name;
    private Scoreboard scoreboard = new Scoreboard();
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public Scoreboard getScoreboard(){
        return scoreboard;
    }
    
}
