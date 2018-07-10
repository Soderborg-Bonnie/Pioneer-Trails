/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.control;

import byui.cit260.pioneerTrails.view.AcquireFood;
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
            double numPeople, double time, double waterRation) {
        if (availableWater < 0 || availableWater > 100) {
            return -1;
        }
        if (waterRation < 1 || waterRation > 1) {
            return -2;
        }
        if (time < 1 || time > 20) {
            return -3;
        }
        if (numPeople < 0 || numPeople > 5) {
            return -4;
        }

        double waterResource = availableWater - (numPeople * time * waterRation);
        {
            if (waterResource <= 0) {
                return -999;
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
