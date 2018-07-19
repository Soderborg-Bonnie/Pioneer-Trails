/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.exceptions.IllnessControlExceptions;

/**
 *
 * @author Tamlyn Laurence
 */
public class IllnessControl {

    public static int calcIllnessOutcome(int choice, int mortalityRate, int chance) throws IllnessControlExceptions {
        if (choice < 1 || choice > 2) {
            throw new IllnessControlExceptions("Your choice must be '1' or '2'.");
        }
        if (mortalityRate < 1 || mortalityRate > 9) {
            throw new IllnessControlExceptions("According to your mortality rate, you're either dead or translated. That shouldn't be the case.");
        }
        if (chance < 1 || chance > 9) {
            throw new IllnessControlExceptions("If your chances are 0% or less or higher than 100%, something's up.");
        } else {
            int calcFutureLife = (choice * mortalityRate) + chance;
            if (calcFutureLife > 13) {
                throw new IllnessControlExceptions("Your numbers aren't looking good for life in the game.");
            }
            return calcFutureLife;

        }

    }
}
