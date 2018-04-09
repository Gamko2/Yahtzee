/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Marc
 */
public class Scoreboard {
    
    public Scoreboard(){
    points.put(new UpperSection("Aces", 1) , -1); 
    points.put(new UpperSection("Twos", 2) , -1);  
    points.put(new UpperSection("Threes", 3) , -1);  
    points.put(new UpperSection("Fours", 4) , -1);  
    points.put(new UpperSection("Fives", 5) , -1);  
    points.put(new UpperSection("Sixes", 6) , -1);
    points.put(new XOfAKind("Three Of A Kind",3) , -1);  
    points.put(new XOfAKind("Four Of A Kind",4) , -1); 
    points.put (new FullHouse("Full House"),-1);
    points.put (new SmallStraight("Small Straight"),-1);
    points.put (new LargeStraight("Large Straight"),-1);
    points.put (new YahtzeeRule("Yahtzee"),-1);
    points.put (new Chance("Chance"),-1);
    }

    private Map<Rule, Integer> points = new HashMap<Rule, Integer>();

    public int calculateTotalPoints() {
        int score = 0;
        for (int k : points.values()) {
            if (k > 0) {
                score += k;
            }
        }
        return score;
    }

    public Rule[] availableFields() {
        List<Rule> tmp = new ArrayList<>();
        for (Rule k : points.keySet()) {
            if (points.get(k) < 0 && points.get(k) != null) {
                tmp.add(k);
            }
        }
        Rule[] result = new Rule[tmp.size()];
        return result = tmp.toArray(result);

    }

    public void writePoints(Rule rule, DiceBox dicebox) {
        points.put(rule, rule.calculatePoints(dicebox));
    }

    public Map<Rule, Integer> getScores() {
        return points;
    }
}
