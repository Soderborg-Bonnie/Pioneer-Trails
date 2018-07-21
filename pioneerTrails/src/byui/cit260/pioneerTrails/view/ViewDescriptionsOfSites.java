/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class ViewDescriptionsOfSites extends View{
    
    public ViewDescriptionsOfSites() {
        super();
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "S":
                saveDescriptionsReport();
                break;
            case "V":
                viewDescriptionsReport();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void viewDescriptionsReport() {
        this.console.println("===========================================================");
        this.console.println("               Site Descriptions Report                 ");
        this.console.println("===========================================================");
        this.console.println("                                                           ");
        this.console.println(String.format("%-30s%-50s", "Site Name", "Description"));
        this.console.println("===========================================================");

        Map map = PioneerTrails.getCurrentGame().getMap();
        Location[][] location = map.getLocations();
        //String msg = "";
        for (int row = 0; row < map.getTotalRows(); row++) {
            for (int column = 0; column < map.getTotalColumns(); column++) {
                Scene scene = map.getLocations()[row][column].getScene();
                this.console.println(String.format("%-30s%-50s", scene.getName(), scene.getDescription()));
            }
        }
        this.console.println("\n\n ");
    }

    private void saveDescriptionsReport() {
//        this.console.println();
        String filePath = this.getInput("\nEnter a location to save the report");

        try (PrintWriter out = new PrintWriter(filePath)) {
            out.printf("===========================================================\r\n");
            out.printf("               Site Description Report                 \r\n");
            out.printf("===========================================================\r\n\n");
            out.printf(String.format("%-30s%-50s\r\n", "Site Name", "Description"));
            out.printf("===========================================================\r\n");

            Map map = PioneerTrails.getCurrentGame().getMap();
            Location[][] location = map.getLocations();
            //String msg = "";
            for (int row = 0; row < map.getTotalRows(); row++) {
                for (int column = 0; column < map.getTotalColumns(); column++) {
                    Scene scene = map.getLocations()[row][column].getScene();
                    out.printf(String.format("%-35s%-5s\r\n", scene.getName(), scene.getDescription()));
                }
            }

            out.println("\n\n ");
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error closing file.");
                return;
            }
            this.console.println("\nThe report has been saved.");
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + ex.getMessage());
        }
    }

//    @Override
//    public String getInputs() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    protected String getPromptMessage() {
        return "Do you want to View (V) or Save (S) the Site Description Report?";
     }

   
    
}
