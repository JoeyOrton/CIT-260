/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.terminalcycle.model;
/**
 *
 * @author Josep
 */
public class TerminalCycle {
    
        private static Game currentGame = null;
        private static Player player = null;
        
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StartProgramView object = new StartProgramView();
        StartProgramView();
        TerminalCycle.setPlayer(player);

    /**
     *
     * @return
     */
    public static Game getCurrentGame() {
            return curretGame;
}
    public static void setCurrentGame(Game currentGame) {
        TerminalCycle.currentGame = currentGame;
    }
    public static Player getPlayer() {
        return player;
    }
    pubic static void setPlayer(Player player) {
        TerminalCycle.player = player;
    }
    }
}
