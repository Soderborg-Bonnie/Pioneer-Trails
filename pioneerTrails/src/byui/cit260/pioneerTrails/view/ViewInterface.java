/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

/**
 *
 * @author tyler
 */
public interface ViewInterface {
    
    public void display(); 
    

    public String getInputs();
    
        
    
    public String getInput(String menuText);
    

    public boolean doAction(String inputs);
    

    
}
