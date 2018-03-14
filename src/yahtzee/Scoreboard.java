/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marc
 */
public class Scoreboard {

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
