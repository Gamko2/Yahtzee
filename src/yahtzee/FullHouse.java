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
public class FullHouse extends Rule {

    private String name = "Full House";

    @Override
    public int calculatePoints(DiceBox dicebox) {
        Map<Integer, Integer> countedResults = dicebox.countAllNumbers();
        if (countedResults.containsValue(2) && countedResults.containsValue(3)) {
            return 25;
        } else {
            return 0;
        }
    }

}
