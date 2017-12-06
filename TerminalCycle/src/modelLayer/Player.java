/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;
import modelLayer.Game;

/**
 *
 * @author Colby
 */
public class Player {
    private Game oneGame;
    private Game twoGame;
    private Game threeGame;
    
    String plName;
    public Player() {
    }
    
    public void setplayerName(String thePlayerName) {
        plName = thePlayerName;
    }
    public String getplayerName(){
        return plName;
    }
}
