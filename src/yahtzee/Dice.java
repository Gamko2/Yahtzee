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
    private boolean locked = false;

    public int getNumber() {
        return number;
    }

    public void rollDice() {
        if (!this.isLocked()){
        Random rand = new Random();
        this.number = rand.nextInt(6) + 1;
        }

    }

    public void lock() {
        this.locked = true;
    }
    
    
   public void unlock(){
       this.locked = false;
   }

    public boolean isLocked() {
        return locked;
    }

}
