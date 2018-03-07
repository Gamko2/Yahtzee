/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author Marc
 */
public class Dice {
private int number;
private boolean hold = false;



public int getNumber(){
    return number;
}

public void rollDice(){
   Random rand = new Random(); 
   int diceRoll =  rand.nextInt(6 - 1 + 1) + 1;
   this.number = diceRoll;
}

public void reverseHold(){
    this.hold = !this.hold;
}

public boolean getHold(){
    return hold;
}
    
    
}
