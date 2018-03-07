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
public class DiceBox {

    private Dice[] dices = new Dice[5];

    public DiceBox() {
        for (int i = 0; i < 5; i++) {
            dices[i] = new Dice();
        }
    }

    public void rollDices() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public void lockDice(int i) {
        dices[i].lock();
    }
}
