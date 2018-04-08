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
abstract class Command {

    private String name;

    Command(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public abstract void execute();

}
