/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.terminalcycle.model;

/**
 *
 * @author Colby
 */
public class GameControl {
    public static Player savePlayer(String name) {
        if (name == null || name.length() > 1) {
            return null;
        }
        Player object = new player();
    }

    private static class player extends Player {

        public player() {
            name = player
        }
    }
}
