/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.exceptions.MapControlExceptions;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Resource;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class MapControl {

//    public static Map createMap( int noOfRows,
// int noOfColumns,
// InventoryItem[] items) {
// if noOfRows < 0 OR numOfColumns < 0
// return null
// endif
// if items is null OR its length is < 1
// RETURN null
// endif
//Map map = new Map object
//save the noOfRows in the map
//save the noOfColumns in the map
//locations = createLocations(noOfRows, noOfColumns)
//Assign the locations array to the map
//scenes = createScenes()
//questions = createQuestions()
//assignQuestionsToScenes()
//assignItemsToScenes()
//assignScenesToLocations()
//return map
//}
    public static Map createMap(int totalRows, int totalColumns) throws MapControlExceptions {
        //System.out.println("createMap() called ***");
        if (totalRows < 0 || totalColumns < 0) {
            throw new MapControlExceptions("You can't be in negative territory in your rows or columns.");
        }

        Map map = new Map();
        map.setTotalRows(totalRows);
        map.setTotalColumns(totalColumns);
        map.setLocations(createLocations());

        return map;
    }

//private static Location[] createLocations() {
//        Location[][] locations = new Location[5][5];
    public static Location[][] createLocations() {
        Location[][] locations = new Location[5][5];
        locations[0][0] = new Location(false, 24);
        locations[0][1] = new Location(false, 23);
        locations[0][2] = new Location(false, 22);
        locations[0][3] = new Location(false, 21);
        locations[0][4] = new Location(false, 20);
        locations[1][0] = new Location(false, 19);
        locations[1][1] = new Location(false, 18);
        locations[1][2] = new Location(false, 17);
        locations[1][3] = new Location(false, 16);
        locations[1][4] = new Location(false, 15);
        locations[2][0] = new Location(false, 14);
        locations[2][1] = new Location(false, 13);
        locations[2][2] = new Location(false, 12);
        locations[2][3] = new Location(false, 11);
        locations[2][4] = new Location(false, 10);
        locations[3][0] = new Location(false, 9);
        locations[3][1] = new Location(false, 8);
        locations[3][2] = new Location(false, 7);
        locations[3][3] = new Location(false, 6);
        locations[3][4] = new Location(false, 5);
        locations[4][0] = new Location(false, 4);
        locations[4][1] = new Location(false, 3);
        locations[4][2] = new Location(false, 2);
        locations[4][3] = new Location(false, 1);
        locations[4][4] = new Location(false, 0);
        return locations;
    }

//    public static Location[][] getLocations() {
//        return locations[][];
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    public Scene getCurrentScene() {
//       return  locations[currentRow][currentCol].getScene();
//    }
//    public static Location[][] getCurrentLocation() {
//         Map map = PioneerTrails.getCurrentGame().getMap();
//        Location locations = new Location[5][5];
//        return map(map.getCurrentRow(),map.getCurrentCol());
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//        
    private void setTotalRows() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTotalColumns() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
