/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

/**
 *
 * @author Bonnie
 */
public class HealthTips extends View {

    public HealthTips() {
        super("Enter your choice for tips on how to handle your malady"
                + "================================================"
                + "              Health Menu"
                + "================================================"
                + "\n**********************************************"
                + "\n* Press 'B' for broken bones.                *"
                + "\n* Press 'F' for fevers.                      *"
                + "\n* Press 'I' for infections.                  *"
                + "\n* Press 'S' for snake bites.                 *"
                + "\n* Press 'H' for delirium.                    *"
                + "\n* Press 'Q' to return to the previous menu   *"
                + "\n**********************************************");
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "B":
                handleBones();
                break;
            case "F":
                handleFever();
                break;
            case "I":
                handleInfections();
                break;
            case "S":
                handleSnakeBites();
                break;
            case "H":
                getHelp();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void handleBones() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleFever() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleInfections() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleSnakeBites() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelp() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
