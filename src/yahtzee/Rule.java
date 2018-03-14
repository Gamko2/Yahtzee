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
public abstract class Rule {

    private String name;

    public abstract int calculatePoints(DiceBox dicebox);

    @Override
    public String toString() {
        return name;
    }

}
