/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import java.io.*;
import java.util.*;

/**
 *
 * @author Colby
 */
public class StartProgramView {

    public void displayStartProgramView() {
        boolean endView = false;
        do{
            String[] inputs = this.getInputs();
                    if (inputs == null || inputs == "Q")
                        return;
                    endView = doAction(inputs);
    }while(endView != true);
    }

    private boolean doAction(String inputs) {
        System.out.println(--- doAction() called---);
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }

    private String[] getInputs() {
        System.out.println("---getInputs() called---");
                
         String[] inputs = new String[1];
         inputs[0] = "testInput";
         
         return inputs;
    }

    private static class string {

        public string() {
        }
    }
    
}
