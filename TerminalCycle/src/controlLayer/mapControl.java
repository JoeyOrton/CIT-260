/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import java.util.ArrayList;
import modelLayer.Actor;
import modelLayer.Game;
import modelLayer.Location;
import modelLayer.Map;
import modelLayer.Question;
import modelLayer.Scene;
import modelLayer.SceneType;

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
        createScenes();
        createQuestions();
        assignQuestionsToScenes(questions, scences);
        assignItemsToScenes(items, scenes);
        assignScenesToLocations(scenes, locations);
        System.out.println("------End of MapControl------");
        
        
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
                    
                }   
                break;
            }
        System.out.println("---about to return Location---");
        String[][] aLocation = null;
        System.out.println("here is Location: " + aLocation[0][0]);
            //aLocation[][]; // return locations
        return null;
}
            
            //ENDFOR    
            //RETURN locations

    private static Scene[][] createScenes() {
        System.out.println("-----createScenes called-----");
        //build an array of scene objects
        //Scene[] curScene;
        //curScene = new Scene[25];
        
        ArrayList<Scene> scenes = new ArrayList<>();
        scenes.add(SceneType.water_scene.ordinal(), new Scene("The floor is flooded"));
        scenes.add(SceneType.trap_scene.ordinal(), new Scene("A large hole sits in your path"));
        scenes.add(SceneType.trader_scene.ordinal(), new Scene("An old man sits nearby with a table of goods"));
        scenes.add(SceneType.mushroom_scene.ordinal(), new Scene("The room glows gently from the fungi"));
        scenes.add(SceneType.fire_scene.ordinal(), new Scene("The floor is literally lava"));
        scenes.add(SceneType.enemy_scene.ordinal(), new Scene("A goblin blocks your path"));
        
        return null;
    }
    private static Question[][] createQuestions() {
        System.out.println("-----createQuestions called-----");
        return null;
    }
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("-----assignQuestionsToScenes called-----");
    }
    private static void assignItemsToScenes(inventoryControl[] items, Scene[] scenes) {
        System.out.println("-----assignItemsToScenes called-----");
    }
    private static void assignScenesToLocations(Scene[] scenes, Location[] location) {
        System.out.println("-----assignScencesToLocations called-----");
    }
    
}