/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.io.PrintWriter;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class ErrorView {

    private static PrintWriter console = PioneerTrails.getOutput();
    private static PrintWriter log = PioneerTrails.getLogFile();

    public static void display(String className, String errorMessage) {
        console.println(
                "\n---ERROR--------------------------"
                + "\n" + errorMessage
                + "\n---------------------------------");

        log.printf("%n%n%s", className + " - " + errorMessage);
    }

}
