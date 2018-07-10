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
public class ViewCurrentResources extends View {

//    public ViewCurrentResources(){
//        this.promptMessage = getCurrentResources();
//    }
//    public String getCurrentResources(){
//        AcquireFood food = AcquireFood.getlistOfItems;
//    }
    public AcquireFood creatSortedListOfItems() {
        AcquireFood listOfItems = AcquireFood.getListOfItems();
        for (int i = 0; i < listOfItems.length - 1; i++) {

            System.out.println(listOfItems);
            return listOfItems;
        }
        return listOfItems;
    }

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
