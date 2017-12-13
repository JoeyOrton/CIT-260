/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import modelLayer.Game;
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
        curGame.setMap(thisMap);
        
        System.out.println(thisMap.getLocation());
        System.out.println("------da------");
        
    }
}