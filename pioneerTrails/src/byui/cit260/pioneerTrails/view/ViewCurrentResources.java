/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.model.Resource;
import byui.cit260.pioneerTrails.model.Wagon;
import java.util.*;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class ViewCurrentResources extends View {

    public ViewCurrentResources() {
        super();
    }

    @Override
    public  boolean doAction(String Inputs) {
        
        System.out.println("VCR doaction before calls: " );
//    public static void resourceList(resource){
//        System.out.println(resource);
//    }
//        viewCurrentResourcesReport();

        Wagon wagon = PioneerTrails.getCurrentGame().getWagon();
        //Map m1 = new Map() {};
//        System.out.println("VCR doaction: " + resource);
//        Resource name = wagon.getResources().get(name);
//        Resource quantity = wagon.getResources().get(quantity);
//        Resource weight = wagon.getResources().get(weight);
//        System.out.println("resource in wagonControl acquireResource function: " + name + quantity + weight);
//        Wagon wagon = PioneerTrails.getCurrentGame().getWagon();
//        Resource resourcesList = Wagon.resources.getKey();
//        wagon.getResources().get(name);
//        System.out.println(resourcesList);
        return false;
    }

    @Override
    protected String getPromptMessage() {
        return "what to do\n\n" + "\n========================================================="
                + "\n             Current Resources Report                    "
                + "\n========================================================="
                + "\nResource              Quantity                     Weight"
                + "\n=========================================================";
              
    }

    private void viewCurrentResourcesReport() {

        this.console.println("===========================================================");
        this.console.println("               Current Resources Report                    ");
        this.console.println("===========================================================");
        this.console.println("                                                           ");
        this.console.println(String.format("%-30s%-30s%-30s", "Resource", "Quantity", "Weight"));
        this.console.println("===========================================================");
    }

}
