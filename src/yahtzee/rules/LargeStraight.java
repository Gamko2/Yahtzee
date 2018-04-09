/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee.rules;

import yahtzee.DiceBox;

/**
 *
 * @author Marc
 */
public class LargeStraight extends Rule {

  

    public LargeStraight(String name) {
        super(name);
    }

    @Override
    public int calculatePoints(DiceBox dicebox) {
        if (dicebox.countNumber(1) == 1 && dicebox.countNumber(2) == 1 && dicebox.countNumber(3) == 1 && dicebox.countNumber(4) == 1 && dicebox.countNumber(5) == 1
                || dicebox.countNumber(2) == 1 && dicebox.countNumber(3) == 1 && dicebox.countNumber(4) == 1 && dicebox.countNumber(5) == 1 && dicebox.countNumber(6) == 1) {
            return 40;
        }
        return 0;
    }

}
