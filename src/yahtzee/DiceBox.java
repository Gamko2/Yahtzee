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
   
   DiceBox(){
       for (int i = 0 ; i<5 ; i++){
           dices[i] = new Dice();
       }
   }
    
    public void rollDices(){
        for (Dice dice : dices) {
            if (dice.getHold()== false) {
                dice.rollDice();
                System.out.println(dice.getNumber());
            }
            else {
                System.out.println(dice.getNumber());
            }
        }
        System.out.println();
    }
    
    public void changeHold(int i){
        dices[i].reverseHold();
    }
}
