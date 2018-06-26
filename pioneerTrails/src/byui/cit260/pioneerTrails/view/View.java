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
public abstract class View implements ViewInterface {

    protected String promptMessage;

    public View() {
    }

    public View(String message) {
        this.promptMessage = message;
    }

    @Override
    public void display() {

        boolean endOfView = false;

        do {

            //System.out.println(menuText);
            String inputs = this.getInputs();

            if (inputs.equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }

    @Override
    public String getInputs() {
        return getInput(this.promptMessage);
    }

    @Override
    public String getInput(String menuText) {
        Scanner scanner = new Scanner(System.in);
        String inputs = "";
        Boolean valid = false;
        while (!valid) {
            System.out.println(menuText);
            inputs = scanner.nextLine();
            inputs = inputs.trim();
            if (inputs.length() < 1) {
                System.out.println("try again");
                continue;
            }
            valid = true;

        }
        return inputs;
    }

}
