/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public abstract class View implements ViewInterface {

    protected String promptMessage;

    protected final BufferedReader keyboard = PioneerTrails.getInFile();
    protected final PrintWriter console = PioneerTrails.getOutFile();

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

            if (inputs.isEmpty() || inputs.equalsIgnoreCase("Q")) {
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
        Scanner keyboard = new Scanner(this.keyboard);
        String inputs = "";
        Boolean valid = false;
        while (!valid) {
            try {
//                System.out.println(menuText);
                this.console.println(menuText);
                inputs = this.keyboard.readLine();
                inputs = inputs.trim();
                if (inputs.length() < 1) {
//                    System.out.println("You must enter a value.");
                    this.console.println("You must enter a value.");
                    continue;
                }
                valid = true;
            } catch (IOException ex) {
                System.out.println("Error reading input: " + ex.getMessage());
            }

        }
        return inputs;
    }

}
