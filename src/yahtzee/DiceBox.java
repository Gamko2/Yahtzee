/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marc
 */
public class DiceBox {

    private Dice[] dices = new Dice[5];

    public DiceBox() {
        for (int i = 0; i < 5; i++) {
            dices[i] = new Dice();
        }
    }
    
    public void resetDice(){
     for (Dice dice : dices)  {
         dice.unlock();
     } 
    }

    public Dice[] getDices(){
        return dices;
    }
    
    public void rollDices() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }
    
    public void unlockDice(int i){
        dices[i].unlock();
    }

    public void lockDice(int i) {
        dices[i].lock();
    }

    public int countNumber(int number) {
        int count = 0;
        for (Dice dice : dices) {
            if (dice.getNumber() == number) {
                count++;
            }
        }
        return count;
    }

    public Map<Integer, Integer> countAllNumbers() {
        Map<Integer, Integer> countedResults = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 6; i++) {
            countedResults.put(i, 0);
        }
        for (Dice dice : dices) {
            countedResults.put(dice.getNumber(), countedResults.get(dice.getNumber()) + 1);
        }
        return countedResults;
    }
    public void displayRolls(){
        for (Dice dice : dices){
            System.out.println(dice.getNumber());
        }
    }
}
