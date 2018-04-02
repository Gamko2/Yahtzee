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
public class FourOfaKind extends Rule {
    private String name = "FourOfaKind";

    @Override
        public int calculatePoints(DiceBox dicebox) {
        for (int i = 1; i <= 6; i++) {
            if (dicebox.countNumber(i) == 4) {
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
