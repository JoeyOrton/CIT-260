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
public class Attack {
    public void playerAttack() {
        System.out.println("You have entered conflict!");
        System.out.println("How do you wish to proceed?");
        System.out.println("A   Attack");
        System.out.println("F   Flee");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        String upChoice = choice.toUpperCase();
        String userChoice = upChoice.trim();
        
        if (userChoice == "A") {
            if (playerPower > monsterPower) {
                monsterPower == 0;
            } else {
                playerHealth = playerHealth -1;
                while (playerHealth > 0) {
                    playerAttack();
                }
            }
        } if (userChoice == "F") {
            return true;
        } else {
            System.out.println("Please pick a valid option");
            playerAttack();
        }
    }
}
