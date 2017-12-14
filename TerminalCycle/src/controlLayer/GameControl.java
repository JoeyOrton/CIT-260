/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import modelLayer.Player;
import modelLayer.Game;
/**
 *
 * @author Colby
 * 
 */




public class GameControl {
    public static Player savePlayer(String name) {
        if (name == null || name.length() < 1) {
            return null;
        }
        Player object = new Player();
        
        object.setplayerName(name);
//StartProgramView.setPlayer(name);
        return object;
    }

    private static class StartProgramView {

        private static void setPlayer(String name) {
            
        }

        public StartProgramView() {
        }
    }
}
