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
public class RestartGame extends View {

    public RestartGame() {

        super("Yay for old games!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public String getInput(String menuText) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
    @Override
    public boolean doAction(String inputs) {

//        String menuItem = inputs.toUpperCase();
//        switch (menuItem) {
//            case "N":
//                gameMenuView();
//                break;
//            case "R":
//                restartGame();
//                break;
//            case "H":
//                getHelp();
//                break;
//            case "Q":
//                return true;
//            default:
//                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
//        }
        return false;
    }

    public void displayRestartGame() {
        display();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
