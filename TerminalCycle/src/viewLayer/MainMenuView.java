/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewLayer;
import modelLayer.Player;

import java.util.Scanner;
import static sun.audio.AudioPlayer.player;


/**
 *
 * @author Colby
 */
class MainMenuView {

    MainMenuView() {
    }
    public void displayMainMenuView() {
        viewLayer.gameMenuView Candy = new viewLayer.gameMenuView();
        boolean endView = false;
        do{
//            Object inputs[] = (Object[]) getInputs();
//            if (inputs == null || inputs[0] == "Q") {
//                return;
//            }endView = doActions(inputs);
//            }while (endView != true) {
//            }
    

    public doAction(Object[] inputs) {
       Object menuItem = inputs[0];
       String menuCaps = menuItem.toUpperCase();
       
       switch (menuCaps) {
           case "N": this.startNewGame();
           case "R": this.restartGame();
           case "H": this.getHelp();
           case "O": this.optionsMenu();
           case "E": return true;
           default: System.out.println("Invalid choice");
       }
        return false;
    }

    private void startNewGame() {
        createNewGame(Player player);
    boolean soundVolume;
    private boolean optionsMenu() {
        boolean i = false;
        do {
            System.out.flush();
        System.out.println("-----Options-----");
        System.out.println("S   Toggle Sound");
        System.out.println("H   How to play");
        System.out.println("E   Exit to Main Menu");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        String upChoice = choice.toUpperCase();
        String userChoice = upChoice.trim();
        
        switch (userChoice) {
            case "S": soundVolume = false;
            i = true;
            case "H": gameInstructions();
            i = true;
            case "E": return true;
            default: System.out.println("Invalid choice");
            
        }
        } while( i = false);
        return false;
    }

    private void restartGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gameInstructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}
}
}
    private void restartGame() {
        startExistingGameView = new StartExistingGameView;
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        
    }

}
