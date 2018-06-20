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
public class View {
    public View(){
    }
    void display(){
    
    
   boolean endOfView = false;

        do { 

//            System.out.println("=======================================");
//            System.out.println("              Main Menu");
//            System.out.println("=======================================");
//            System.out.println("\n*************************************");
//            System.out.println("\n* Press 'N' to start a new  game.   *");
//            System.out.println("\n* Press 'R' to reload a saved game. *");
//            System.out.println("\n* Press 'H' to get help about game. *");
//            System.out.println("\n* Press 'Q' to quit  game.          *");
//            System.out.println("\n*************************************");
            System.out.println(menuText);
            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }
private String[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Please input your choice: ");
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
    private String[] getInputs() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String[] inputs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//  }} 
    
