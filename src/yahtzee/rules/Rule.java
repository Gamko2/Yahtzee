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
public abstract class Rule  {

    private static int count = 0;
    private int number;
    private String name;

    public Rule(String name) {
        this.name = name;
        number = count++;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public abstract int calculatePoints(DiceBox dicebox);

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
