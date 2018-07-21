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
        super();
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
                this.console.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void handleBones() {
        System.out.println("\nFor broken bones: Set bone. Wrap well. Keep weight off. Don't use limb with broken bone for 2 months.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleFever() {
        System.out.println("\nFor fever: Rest is best. Stay out of sun until fever is broken.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleInfections() {
        System.out.println("\nFor infections: If wound is infected, clean often and keep covered.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void handleSnakeBites() {
        System.out.println("\nFor snake bites: Clean bite. Suck venom from bite. Keep bite raised above heart level.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    @Override
    protected String getPromptMessage() {
        return "\nEnter your choice for tips on how to handle your malady"
                + "\n================================================"
                + "\n              Health Menu"
                + "\n================================================"
                + "\n**********************************************"
                + "\n* Press 'B' for broken bones.                *"
                + "\n* Press 'F' for fevers.                      *"
                + "\n* Press 'I' for infections.                  *"
                + "\n* Press 'S' for snake bites.                 *"
                + "\n* Press 'H' for Help Menu.                   *"
                + "\n* Press 'Q' to return to the previous menu   *"
                + "\n**********************************************";
    }

}
