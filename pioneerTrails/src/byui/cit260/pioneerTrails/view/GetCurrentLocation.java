/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.*;
import byui.cit260.pioneerTrails.model.*;

/**
 *
 * @author tyler
 */
 class GetCurrentLocation {
    

     void displayGetCurrentLocation() {
         Scene scene = GameControl.getCurrentScene();
        System.out.println("You are currently at " + scene.getName());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
