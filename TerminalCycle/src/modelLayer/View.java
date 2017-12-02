/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.util.Scanner;

/**
 *
 * @author Colby
 */
public class View {
    private String[] getInputs(String[] cake) {
       long total = 0;
        for (String time : cake) {
       }
        
        
        
        String[] inputs = new String[1];
         System.out.println(inputs[0]);
         boolean valid = false;
         while(valid == false) {
             Scanner keyboard = new Scanner(System.in);
             System.out.println(inputs[1]);
             String usefulData = keyboard.nextLine();
             String playerInput = usefulData.trim();
             int inputLength = playerInput.length();
             if (inputLength < 1) {
                 System.out.println("You must choose a valid input.");
             }else {
                 playerInput = inputs[2];
                 valid = true;
             }
         }
             return inputs;
        }
    
    
//        private Object display() {
//        do {
//        inputs = getInputs();
//        doAction(inputs);
//        displayResults();
//        while ();
//}
}