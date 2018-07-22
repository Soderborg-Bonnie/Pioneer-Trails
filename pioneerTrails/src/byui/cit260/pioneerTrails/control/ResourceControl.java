/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.exceptions.ResourceControlExceptions;
//import byui.cit260.pioneerTrails.view.AcquireFood;
import java.util.ArrayList;

/**
 *
 * @author tyler
 */
public class ResourceControl {

    /**
     * Algorithm for calcWaterConsumption: BEGIN IF availableWater <0 or >101
     * RETURN -1 IF waterRation <1 or >1 RETURN -2 IF time <1 or > 20 RETURN -3
     * IF numPeople <0 or >5 RETURN -4
     *
     * calcWaterConsumption(availableWater, numPeople, time, waterRation):
     * double waterResource = availableWater - (numPeople*time*waterRation) IF
     * waterResource
     */
    public static double calcWaterConsumption(double availableWater,
            double numPeople, double time, double waterRation) throws ResourceControlExceptions {
        if (availableWater < 0 || availableWater > 100) {
            throw new ResourceControlExceptions("The available water needs to be between 0-100%. Not more, not less.");
        }
        if (waterRation < 1 || waterRation > 1) {
            throw new ResourceControlExceptions("Your water ration is limited to 1.");
        }
        if (time < 1 || time > 20) {
            throw new ResourceControlExceptions("Your days between water refills can't be negative. Neither can it be longer than 20 days.");
        }
        if (numPeople < 0 || numPeople > 5) {
            throw new ResourceControlExceptions("If you have zero people in your group, water's the least of your worries. If you have more than five people in your group, you'll deplete your supplies too quickly. The number of people must be between 1-5.");
        }

        double waterResource = availableWater - (numPeople * time * waterRation);
        {
            if (waterResource <= 0) {
                throw new ResourceControlExceptions("You've run out of water.");
            } else {
                return waterResource;
            }
        }
    }

//public String creatSortedListOfItems(){
//    AcquireFood listOfItems = AcquireFood.getListOfItems();
//    for (int i = 0; i<listOfItems.length-1; i++){
//    System.out.println('listOfItems[i]');
//    return listOfItems;
//    }
//}
//    public String createSortedListOfItems() {
//
////        ListOfItems listOfItems = new ListOfItems();
//        
//        String listOfItems = listOfItems.getAcquireFood();
//        int al = listOfItems.length;
//        int k;
//        for (int k = al; k >= 0; k--) {
//            for (int i = 0; 1 < al - 1; i++) {
//                k = i + 1;
//                if (listOfItems[i] > listOfItems[k]) {
//                    swapSpots(i, k, listOfItems);
//                }
//            }
//        }
//        return listOfItems[];
//    }
//
//    private static void swapSpots(int i, int k, String[] listOfItems) {
//        String temp;
//        temp = listOfItems[i];
//        listOfItems[i] == listOfItems[k];
//        listOfItems[k] == temp;
//        return new listOfItems();
//    }
//
//    private static void printList();
//
//    {
//        for (int i = 0, i <al; i++) {
//            System.out.println(listOfItems[i] + ", ");
//        }
//    }
//}
}
