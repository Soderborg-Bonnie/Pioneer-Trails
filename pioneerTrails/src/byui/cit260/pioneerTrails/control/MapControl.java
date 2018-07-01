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
        locations[0] = new Location();
    }
{
    
}
        
    

   
 

    
 
        public Map() {
        }

        private void setTotalRows() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTotalColumns() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
      
}
