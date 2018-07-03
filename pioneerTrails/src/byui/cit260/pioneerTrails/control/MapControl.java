/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Resource;



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
    
    public static Map createMap(int totalRows, int totalColumns, Resource[] resources){
        //System.out.println("createMap() called ***");
        if (totalRows < 0 || totalColumns < 0)
            return null;
        if(resources == null || resources.length < 1)
            return null;
        
        Map map = new Map();
        map.setTotalRows(totalRows);
        map.setTotalColumns(totalColumns); 
        return new Map();
    }
        

    private static Location[] createLocations() {
        Location[] locations = new Location[25];
        locations[0] = new Location(0,0,false,24);
        locations[1] = new Location(0,1,false,23);
        locations[2] = new Location(0,2,false,22);
        locations[3] = new Location(0,3,false,21);
        locations[4] = new Location(0,4,false,20);
        locations[5] = new Location(1,0,false,19);
        locations[6] = new Location(1,1,false,18);
        locations[7] = new Location(1,2,false,17);
        locations[8] = new Location(1,3,false,16);
        locations[9] = new Location(1,4,false,15);
        locations[10] = new Location(2,0,false,14);
        locations[11] = new Location(2,1,false,13);
        locations[12] = new Location(2,2,false,12);
        locations[13] = new Location(2,3,false,11);
        locations[14] = new Location(2,4,false,10);
        locations[15] = new Location(3,0,false,9);
        locations[16] = new Location(3,1,false,8);
        locations[17] = new Location(3,2,false,7);
        locations[18] = new Location(3,3,false,6);
        locations[19] = new Location(3,4,false,5);
        locations[20] = new Location(4,0,false,4);
        locations[21] = new Location(4,1,false,3);
        locations[22] = new Location(4,2,false,2);
        locations[23] = new Location(4,3,false,1);
        locations[24] = new Location(4,4,false,0);
       return locations;}

    public static Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Location getCurrentLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
       
       
    

    

        
    

   
 

    
 
       

        private void setTotalRows() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTotalColumns() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
      
}
