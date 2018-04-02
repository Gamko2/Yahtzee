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
public class YahtzeeRule extends Rule {

    private String name = "Yahtzee";

    @Override
    public int calculatePoints(DiceBox dicebox) {
        Map<Integer, Integer> countedResults = dicebox.countAllNumbers();
        if (countedResults.containsValue(5)) {
            return 50;
        }
        return 0;
    }

}
