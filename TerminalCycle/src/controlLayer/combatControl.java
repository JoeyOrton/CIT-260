/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlLayer;
import java.util.Scanner;
/**
 *
 * @author Colby
 */
public class combatControl {
    public void playerAttack() {
        System.out.println("You have entered conflict!");
        System.out.println("How do you wish to proceed?");
        System.out.println("A   Attack");
        System.out.println("F   Flee");
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        String upChoice = choice.toUpperCase();
        String userChoice = upChoice.trim();
        
        modelLayer.Monster Butter = new modelLayer.Monster();
        int monsterPower = Butter.monsterPower;
        boolean monsterLife = Butter.monsterLife;
        
        modelLayer.Actor Cake = new modelLayer.Actor();
        int playerPower = Cake.playerPower;
        int playerHealth = Cake.playerHealth;
        if ("A".equals(userChoice)) {
            if (playerPower > monsterPower) {
                monsterLife = false;
            } else {
                playerHealth = playerHealth -1;
                if (playerHealth > 0) {
                    playerAttack();
                } else {
                    //Player dies here. Make it happen.
                }
            }
        } if ("F".equals(userChoice)) {
            System.out.println("You flee!");
            //Add retrun to room here!
        } else {
            System.out.println("Please pick a valid option");
            playerAttack();
        }
    }
}
