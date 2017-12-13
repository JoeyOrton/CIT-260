/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewLayer;
import modelLayer.Player;
import modelLayer.Actor; 
import java.util.Scanner;
import modelLayer.Game;
import controlLayer.MapControl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Colby
 */
class MainMenuView {

    MainMenuView() {
        
    }
    public void displayMainMenuView() {
        System.out.println("");
        System.out.println("-----Main Menu-----");
        System.out.println("(Enter the letter corisponding to your choice)");
        System.out.println("");
        System.out.println("(N) - New Game");
        System.out.println("(C) - Continue Saved Game");
        System.out.println("(H) - How to play");
        System.out.println("(O-) - Options");
        System.out.println("(E) - Exit Game");
        doAction();
    }
//        viewLayer.gameMenuView Candy = new viewLayer.gameMenuView();
//        boolean endView = false;
//        do{
//            Object inputs[] = (Object[]) getInputs();
//            if (inputs == null || inputs[0] == "Q") {
//                return;
//            }endView = doActions(inputs);
//            }while (endView != true);
//            }
    

    public void doAction() {
        String choice = null;
        Scanner keyboard = new Scanner(System.in);
        choice = keyboard.nextLine();
        choice = choice.toUpperCase();
       Game curGame = null;
       switch (choice) {
           case "N": curGame = this.startNewGame();
           MapControl.sceneTraffic(curGame);
           break;
           case "C": {
            try {
                curGame = this.continueGame();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            MapControl.sceneTraffic(curGame);
            break;
        }
           case "H": this.gameInstructions();
           case "O": this.optionsMenu();
           case "E": return;
           default: System.out.println("Invalid choice");
       }
    }
    String howToPlay = "This game is entirely text-based. Simalar to a \"choose-your-own-adventure\" book, you will be presented with a situation\nas well as several choices. Simply type the letter corisponding with what you choose.\nGood luck!";
//    createNewGame(Player player);
    public void optionsMenu() {
            System.out.flush();
        System.out.println("-----Options-----");
        System.out.println("(E) - Exit to Main Menu");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        String upChoice = choice.toUpperCase();
        String userChoice = upChoice.trim();
        
        switch (userChoice) {
            case "E": displayMainMenuView();
            default: System.out.println("Invalid choice");
            
        }
    }    
    
    private void gameInstructions() {
        System.out.println(howToPlay);
        displayMainMenuView();
    }

    private static Game startNewGame() {
        Game aGame = new Game();
        Actor anActor = new Actor();
        System.out.println("----New Game Created-----\n");
        System.out.println("Choose your warrior:");
        System.out.println("(S) - Swordsman\nBuilt for offence and equipped with a mighty sword, this choice focuses on attack.\n---Attack: +10 Defence: +0---");
        System.out.println("(B) - Shield bearer\nThe shield you wield is well suited to both protecting and smashing\n---Attack: +0 Defence: +10---");
        System.out.println("(D) - Dagger weilder\nWith these two blades you are ready to defend yourself as well as attack\n---Attack: +5 Defence: +5---");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        String upChoice = choice.toUpperCase();
        String userChoice = upChoice.trim();
        
        switch (userChoice) {
            case "S": anActor.setCharacterType("sword");
            case "B": anActor.setCharacterType("shield");
            case "D": anActor.setCharacterType("dagger");
            default: System.out.println("--Character Type Set--");
        
        System.out.println("Enter your characters name:");
        String name = keyboard.nextLine();
        anActor.setName(name);
        aGame.setActor(anActor);
            
        gameSave(aGame);
        System.out.println(aGame);
        return aGame;
        }
    }
    public static void gameSave(Game aGame) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a title for this save file:");
        String gameName = keyboard.nextLine();
        System.out.println("-----Saving Game-----");
        //save file with user entered name
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(gameName);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(aGame);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
	System.out.println("------Game Saved------");
    }
    private Game continueGame() throws ClassNotFoundException, IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your games save name:");
        String gameName = keyboard.nextLine();
        // read object from file
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(gameName);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectInputStream ois = null;
        Game thisGame = null; 
        try {
            ois = new ObjectInputStream(fis);
           thisGame = (Game) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
	ois.close();
        return thisGame;
    }
}

//    private void restartGame() {
//        startExistingGameView = new StartExistingGameView;
//        startExistingGameView.displayStartExistingGameView();
//    }

//    private void getHelp() {
//        
//    }
