/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Bonnie
 */
public class ViewFoodItems extends View {
    
    public ViewFoodItems() {
        
    }

    public void printViewFoodItems(ArrayList<AcquireFood> listOfItems, String foodItemList) {
        try (PrintWriter out = new PrintWriter(foodItemList)) {
            out.println("\n\n             List of Food Items on Hand            ");
            out.printf("%-30s\r\n", "Type & Quantity");
            out.printf("%-30s", "---------------");
            for (AcquireFood foodItem: listOfItems) {
                //printf(foodItem.listOfItems);    need to store a list in a model layer, like game
            }

        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }

    @Override
    public boolean doAction(String inputs) {
     return false;   
    }

// @Override  
//    public boolean doAction(String inputs) {
//        String filePath = inputs;
//        try (PrintWriter out = new PrintWriter(foodItemList)){
//            out.println("\n\n             List of Food Items on Hand            ");
//                    out.printf("%n-20s%10s%10s, Type & Quantity");
//                    out.printf("%n-20s%10s%10s", "---------------");
//                    
//        }
//        catch (IOException ex){
//            System.out.println("I/O Error: " + ex.getMessage());
//        }
//        Game game = PioneerTrails.getCurrentGame();
//        try {
//        GameControl.saveGame(game,filePath);
//        } catch (Exception ex) {
//            ErrorView.display(this.getClass().getName(), ex.getMessage());
//            return false;
//        }
//        this.console.println("\n======================================="
//                + "\nThe game was saved to the following file:"
//                + "\n" + filePath
//                + "\n=======================================");
//        return true;
//    }  

    @Override
    protected String getPromptMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
