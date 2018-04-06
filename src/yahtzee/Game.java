/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private int currentPlayer = 0;
    private int numberOfRolls = 0;
    private DiceBox diceBox = new DiceBox();
    boolean isRunning = false;

    public void addPlayer(String name) {
        Player tmp = new Player(name);
        players.add(tmp);
    }

    public void startGame() {
        currentPlayer = -1;
        isRunning = true;
        newRound();
    }

    public void endGame() {
        isRunning = false;
    }

    public void newRound() {

        if (currentPlayer < players.size() - 1) {
            currentPlayer++;
        }

        if (players.get(players.size() - 1).getScoreboard().availableFields().length == 0) {
            endGame();
        } else {
            currentPlayer = 0;
        }

        diceBox.resetDices();
        numberOfRolls = 0;
    }

    public void rollDices() {
        if (numberOfRolls < 3) {
            diceBox.rollDices();
        }
        numberOfRolls++;
    }

    public void holdDie(int i) {
        if (numberOfRolls > 0) {
            diceBox.lockDice(i);
        }
    }

    public void unlockDice(int i) {
        if (numberOfRolls > 0) {
            diceBox.unlockDice(i);
        }
    }

    public void writePoints(Rule rule) {
        players.get(currentPlayer).getScoreboard().writePoints(rule, diceBox);
        newRound();
    }
    
    public boolean isRunning(){
        return isRunning;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    

}
