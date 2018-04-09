/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.rules;

import yahtzee.rules.Rule;
import java.util.Map;
import yahtzee.DiceBox;

/**
 *
 * @author Marc
 */
public class YahtzeeRule extends Rule {

    

    public YahtzeeRule(String name) {
        super(name);
    }

    @Override
    public int calculatePoints(DiceBox dicebox) {
        Map<Integer, Integer> countedResults = dicebox.countAllNumbers();
        if (countedResults.containsValue(5)) {
            return 50;
        }
        return 0;
    }

}
