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
public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiceBox diceBox = new DiceBox();
        diceBox.rollDices();
        diceBox.lockDice(1);
        diceBox.lockDice(2);
        diceBox.lockDice(0);
        diceBox.rollDices();
    }

}
