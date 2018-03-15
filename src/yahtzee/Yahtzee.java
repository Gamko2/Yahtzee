/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.Map;

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
        diceBox.displayRolls();
        Map<Integer, Integer> results = diceBox.countAllNumbers();
        System.out.println(results.keySet());
        System.out.println(results.values());
        System.out.println(diceBox.countNumber(5));
    }

}
