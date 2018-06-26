/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

//import java.util.Scanner;
/**
 *
 * @author Bonnie
 */
public class GetHelp extends View {

    public GetHelp() {
        super("\n==============================="
                + "\n          Help Menu"
                + "\n==============================="
                + "\n*************************************"
                + "\n* G - What is the goal of the game? *"
                + "\n* C - How to move                   *"
                + "\n* E - Estimate resources            *"
                + "\n* A - Harvest resources             *"
                + "\n* Q - Quit                          *"
                + "\n*************************************");
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "G":
                getGameGoal();
                break;
            case "C":
                getMoveHelp();
                break;
            case "E":
                estimateResources();
                break;
            case "A":
                harvestResources();
                break;
            case "Q":
                return true;
            default:
                System.out.println("You've come to the right place. You clearly need HELP. Select a valid option");
        }

        return false;

    }

    private void getGameGoal() {
        GetGameGoal getGameGoal = new GetGameGoal();
        getGameGoal.display();
    }

    private void getMoveHelp() {
        GetMoveHelp getMoveHelp = new GetMoveHelp();
        getMoveHelp.display();
    }

    private void estimateResources() {
        EstimateResources estimateResources = new EstimateResources();
        estimateResources.display();
    }

    private void harvestResources() {
        HarvestResources harvestResources = new HarvestResources();
        harvestResources.display();
    }

//    @Override
//    public String getInput(String menuText) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    void displayGetHelp() {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
