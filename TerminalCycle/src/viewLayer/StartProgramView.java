/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import controlLayer.GameControl;
import modelLayer.Player;
import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Colby
 */
class StartProgramView {

    public void displayStartProgramView() {
        boolean endView = false;
        do{
            String inputs[] = this.getInputs();
                    if (inputs == null || inputs[0] == "Q" )
                        return;
                    endView = doAction(inputs);
    }while(endView != true);
    }

    private boolean doAction(String[] inputs) {
       String playersName = inputs[0];
       Player player = GameControl.savePlayer(playersName);
       if (player == null) {
           System.out.println("Could not create player");
           System.out.println("Enter a different name");
           return false;
       } else {
           String line = "========================================"
                   + "Welcome to your Terminal Cycle, " + playersName
                   + "========================================";
           System.out.print("line");
           MainMenuView object = new MainMenuView();
           object.displayMainMenuView();
           }
           return true;
        }

       

    private String[] getInputs() {
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
         }
    return inputs;
    }

}