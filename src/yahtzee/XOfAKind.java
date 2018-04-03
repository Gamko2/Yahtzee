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
public class XOfAKind extends Rule {

    private int number;

    public XOfAKind(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public int calculatePoints(DiceBox dicebox) {
        for (int i = 1; i <= 6; i++) {
            if (dicebox.countNumber(i) == number) {
                int result = 0;
                for (Dice dice : dicebox.getDices()) {
                    result += dice.getNumber();
                }
                return result;
            }
        }
        return 0;

    }
}
