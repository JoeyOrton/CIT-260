/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import modelLayer.Actor;
import modelLayer.Game;
import modelLayer.Location;
import modelLayer.Map;

/**
 *
 * @author Colby
 */
public class MapControl {
    public static void sceneTraffic(Game curGame) {
        Map thisMap = new Map();
        System.out.println("You're in MapContol!");
        System.out.println("Your current game is: " + curGame);
        System.out.println("the Map object look like this: " + thisMap);
        
        int numOfRows = 5;
        int numOfCol = 5;
        
        createLocations(numOfRows, numOfCol);
//        curGame.setMap(thisMap);
//        System.out.println(thisMap.getLocation());
        
        System.out.println("------da------");
        
        
    }
    public static Location[][] createLocations(int numOfRows,int numOfCol){ 
        
        
            if(numOfRows < 1 || numOfCol < 1){
                return null;
            }     
            Location[][] gameLocations = new Location[numOfRows][numOfCol];
            for (;numOfRows<5;numOfRows++){
                for(;numOfCol<5;numOfCol++){ 
                    Location.setRow(numOfRows);
                    Location.setCol(numOfCol);
                    Location.setVisit(false);
                    //Assign location to the row, and column in array
                    Location aLocation = new Location(numOfRows, numOfCol);
                    break;
                }
                break;
            }
        Location[][] Location = null;
        System.out.println("about to return Location!!!!");
        System.out.println("here is Location: " + aLocation(0, 0));
            return aLocation(0, 0); // return locations. idk
                    }
            
            //ENDFOR    
            //RETURN locations

    
}