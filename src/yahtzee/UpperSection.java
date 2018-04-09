/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import yahtzee.rules.Rule;

/**
 *
 * @author Marc
 */
public class UpperSection extends Rule {

    private int number;

    public UpperSection(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public int calculatePoints(DiceBox dicebox) {
        int result = 0;
        return result = dicebox.countNumber(number) * number;
    }

}
