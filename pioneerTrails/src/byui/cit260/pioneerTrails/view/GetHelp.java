/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class GetHelp {

    public GetHelp() {
    }
    
    public void displayGetHelp(){
        
        boolean endOfView = false;

        do {

            System.out.println("===============================");
            System.out.println(" Help Menu");
            System.out.println("===============================");
            System.out.println("\n*************************************");
            System.out.println("\n* G - What is the goal of the game? *");
            System.out.println("\n* M - How to move                   *");
            System.out.println("\n* E - Estimate resources            *");
            System.out.println("\n* H - Harvest resources             *");
            System.out.println("\n* Q - Quit                          *");
            System.out.println("\n*************************************");

            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }
//   

    private String[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Please select an option: ");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            if (inputs[0].length() < 1) {
                System.out.println("try again");
                continue;
            }
            valid = true;

        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {

        String menuItem = inputs[0].toUpperCase();
        
            switch (menuItem) {
                case "G":
                    getGameGoal();
                    break;
                case "M":
                    getMoveHelp();
                    break;
                case "E":
                    estimateResources();
                    break;
                case "H":
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
        getGameGoal.displayGetGameGoal();
    }

    private void getMoveHelp() {
        GetMoveHelp getMoveHelp = new GetMoveHelp();
        getMoveHelp.displayGetMoveHelp();
    }

    private void estimateResources() {
        EstimateResources estimateResources = new EstimateResources();
        estimateResources.displayEstimateResources();
    }

    private void harvestResources() {
        HarvestResources harvestResources = new HarvestResources();
        harvestResources.displayHarvestResources();
    }
}



    
    


