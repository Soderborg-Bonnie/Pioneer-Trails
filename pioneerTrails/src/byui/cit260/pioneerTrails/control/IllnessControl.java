/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

/**
 *
 * @author Tamlyn Laurence
 */
public class IllnessControl {

    public static int calcIllnessOutcome(int choice, int mortalityRate, int chance) {
        if (choice < 1 || choice > 2) {
            return -1;
        }
        if (mortalityRate < 1 || mortalityRate > 9) {
            return -2;
        }
        if (chance < 1 || chance > 9) {
            return -3;
        } else {
            int calcFutureLife = (choice * mortalityRate) + chance;
            if (calcFutureLife > 13) {
                return -4;
            }
            return calcFutureLife;

        }

    }
}
