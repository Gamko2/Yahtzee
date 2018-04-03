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
public class Chance extends Rule {


    public Chance(String name) {
        super(name);
    }

    @Override
    public int calculatePoints(DiceBox dicebox) {
        int result = 0;
        for (Dice dice : dicebox.getDices()) {
            result += dice.getNumber();
        }
        return result;
    }

}
