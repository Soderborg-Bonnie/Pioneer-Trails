/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.model.Resource;
import byui.cit260.pioneerTrails.model.Wagon;
import java.util.Map;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class ViewCurrentResources extends View{

    public ViewCurrentResources() {
        super();
    }

    

    @Override
    public boolean doAction(String inputs) {
        Wagon wagon = PioneerTrails.getCurrentGame().getWagon();
        
//        Resource resourcesList = Wagon.resources.getKey();
       
//        wagon.getResources().get(name);
//        System.out.println(resourcesList);
        return false;
    }

    @Override
    protected String getPromptMessage() {
        return "";
    }

    
    
}
