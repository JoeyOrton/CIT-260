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
 * METHODS:
 *  New Game
 *  Save Game
 *  Open Game
 *  Determine win or loss
 * 
 */




public class GameControl {
    public static Player savePlayer(String name) {
        if (name == null || name.length() > 1) {
            return null;
        }
        Player object = new Player();
        StartProgramView.setPlayer();
        return null;
    }

    private static class StartProgramView {

        private static void setPlayer() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public StartProgramView() {
        }
    }
}
