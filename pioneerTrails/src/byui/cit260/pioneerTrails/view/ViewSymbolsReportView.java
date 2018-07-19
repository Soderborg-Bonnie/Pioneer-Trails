/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Scene;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class ViewSymbolsReportView extends View {

    public ViewSymbolsReportView() {
        super("Do you want to View (V) or Save (S) the Location Symbols Report?");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "S":
                saveSymbolReport();
                break;
            case "V":
                viewSymbolReport();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void viewSymbolReport() {
        this.console.println("===========================================================");
        this.console.println("LOCATION SYMBOLS REPORT");
        this.console.printf("%n%-20s%-5s%", "Location Name", "Location Symbol");
        this.console.println("\n===========================================================");
        
        Map map = PioneerTrails.getCurrentGame().getMap();
        Location[][] location = map.getLocations();
        String msg = "";
        for (int row = 0; row < map.getTotalRows(); row++) {
            for (int column = 0; column < map.getTotalColumns(); column++) {
                Scene scene = map.getLocations()[row][column].getScene();
                this.console.printf("%n%-20s%-5s%", scene.getName(),scene.getSymbol());
            }
        }
        this.console.println("\n\n ");
    }

    private void saveSymbolReport() {
        this.console.println("\nEnter a location to save the report");
        String filePath = this.getInputs();
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println("===========================================================");
            out.println("LOCATION SYMBOLS REPORT");
            out.printf("%n%-20s%-5s%", "Location Name", "Location Symbol");
            out.println("\n===========================================================");
            
            Map map = PioneerTrails.getCurrentGame().getMap();
        Location[][] location = map.getLocations();
        String msg = "";
        for (int row = 0; row < map.getTotalRows(); row++) {
            for (int column = 0; column < map.getTotalColumns(); column++) {
                Scene scene = map.getLocations()[row][column].getScene();
                out.printf("%n%-20s%-5s%", scene.getName(),scene.getSymbol());
            }
        }
        out.println("\n\n ");
        } catch (FileNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
}
