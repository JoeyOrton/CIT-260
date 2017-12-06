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
public class StartProgramView {

    public static void displayStartProgramView() {
        boolean endView = false;
        do{
            String input = StartProgramView.getInputs();
            //System.out.println("displayStartProgramView gives us: " + input);
            
                    if (input == null || input == "Q" )
                        return;
                    endView = doAction(input);
    }while(endView != true);
    }

    private static boolean doAction(String input) {
       //String playersName = input;
       //System.out.println("input has been assinged. It is: " + input);
       Player player = GameControl.savePlayer(input);
       if (player == null) {
           System.out.println("Could not create player");
           System.out.println("Enter a different name");
           return false;
       } else {
           String line = "========================================"
                   + "Welcome to your Terminal Cycle, " + input
                   + " ========================================";
           System.out.print(line);
           MainMenuView object = new MainMenuView();
           object.displayMainMenuView();
           }
           return true;
        }

       

    private static String getInputs() {
         String input = new String();
         System.out.println("___________                  .__              .__  _________              .__          \n" +
"\\__    ___/__________  _____ |__| ____ _____  |  | \\_   ___ \\___.__. ____ |  |   ____  \n" +
"  |    |_/ __ \\_  __ \\/     \\|  |/    \\\\__  \\ |  | /    \\  \\<   |  |/ ___\\|  | _/ __ \\ \n" +
"  |    |\\  ___/|  | \\/  Y Y  \\  |   |  \\/ __ \\|  |_\\     \\___\\___  \\  \\___|  |_\\  ___/ \n" +
"  |____| \\___  >__|  |__|_|  /__|___|  (____  /____/\\______  / ____|\\___  >____/\\___  >\n" +
"             \\/            \\/        \\/     \\/             \\/\\/         \\/          \\/ ");
         System.out.println("Built By Colby Smith\n");
         System.out.println("---Welcome---");
         String playerName = null;
         boolean valid = false;
         while(valid == false) {
             Scanner keyboard = new Scanner(System.in);
             System.out.println("Enter your name:");
             playerName = keyboard.nextLine();
             //System.out.println("aName is: " + playerName);
             playerName.trim();
             //System.out.println("After a trim playerName is: " + playerName);
             int nameLength = playerName.length();
             if (nameLength < 2) {
                 System.out.println("You must enter a valid name");
             }else {
                 valid = true;
             }
         }
    return playerName;
    }

}