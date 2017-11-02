/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.terminalcycle.model;
import java.util.Scanner;


/**
 *
 * @author Colby
 */
class MainMenuView {
    public void displayMainMenuView() {
        boolean endView = false;
        do{
            Object inputs[] = (Object[]) getInputs();
            if (inputs == null || inputs[0] == "Q") {
                return;
            endView = doActions(inputs);
            }while (endView != true) {
            }
    private Object getInputs() {
       String inputs[] = new String[1];
         System.out.println("You have engaged Terminal Cycle");
         System.out.println("---Welcome---");
         
         boolean valid = false;
         while(valid == false) {
             Scanner keyboard = new Scanner(System.in);
             System.out.println("Enter the players name:");
             String aName = keyboard.nextLine();
             String playerName = aName.trim();
             int nameLength = playerName.length();
             if (nameLength > 2) {
                 System.out.println("You must enter a valid name");
             }else {
                 valid = true;
             }
             return inputs;
        }
    }

    private boolean doActions(Object[] inputs) {
       Object menuItem = inputs[0];
       String menuCaps = menuItem.toUpperCase();
       
       switch (menuCaps) {
           case "N": startNewGame();
           case "R": restartGame();
           case "H": getHelp();
           case "O": optionsMenu();
           case "E": return true;
           default: System.out.println("Invalid choice");
       }
    }

    private void startNewGame() {
        public static void createNewGame(Player player);
        gameMenuView = new Object GameMenuView;
        gameMenuView.displayGameMenuView();
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
        } while i = false;
    }
}
    }

    private void restartGame() {
        startExistingGameView = new StartExistingGameView;
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        
    }
    display() {
        do {
        inputs = getInputs();
        doAction(inputs);
        displayResults();
        while ();
}
}
}
