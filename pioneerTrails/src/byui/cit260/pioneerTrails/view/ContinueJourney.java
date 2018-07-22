/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.Random;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class ContinueJourney extends View {

    boolean journeyComplete;

    public ContinueJourney() {
        super();
//        this.promptMessage = getScenePrompt();
    }

//    public void display() {
//        if(!journeyComplete) {
//            super.displayMessage();
//        }
//        else {
//            super.display();
//        }
//    }
    @Override
    public String getPromptMessage() {
        if (GameControl.advanceLocation()) {
            journeyComplete = false;
            String addMessage = "";
            double doubleNum = 10.00;
            Random rand = new Random();
            double min =0.0;
            double max = 9.0;
            double x = (Math.random()*((max-min)+1));
            double xrounded = Math.round(x*100.0)/100.0;
            
            boolean gameOver = false;
            double randomX =  (Math.random());
            switch ((int)xrounded){
                    case 0:
                    addMessage="You were trampled by a buffalo. Sorry, game over.";
                    gameOver = true;
                    break;
                    case 1:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 2:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 3:
                    addMessage="Your wagon tipped over and you broke a wheel. Sorry, game over.";
                    gameOver = true;
                    break;
                    case 4:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 5:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 6:
                    addMessage="You lost all your water and there's none in sight. Sorry, game over.";
                    gameOver = true;
                    break;
                    case 7:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 8:
                    addMessage="Keep on keeepin' on. You're doing great!";
                    break;
                    case 9:
                    addMessage="Your food was stolen by bandits. Sorry, game over.";
                    gameOver = true;
                    break;
            }       
                    
                    
                    
              if (gameOver = true){
                System.out.println("Please press Q lots of times to ends your misery.");
                //PioneerTrails.getGame().setGameOver(true);
            }      
            
                    
            Scene scene = GameControl.getCurrentScene();
            String msg = "Welcome to " + scene.getName() + ", " + scene.getDescription()
                    + ". " + "Press 'Q' to return to the location menu and choose an option." + "   " + addMessage;
            
            //System.out.println(msg);
            return msg;
            
            //System.out.println(endMsg);
        } // todo: if we die, display we died   return true
        
        else {
            Scene scene = GameControl.getCurrentScene();
            journeyComplete = true;
            
            String endMsg = "Congratulations! You made it to " + scene.getName() + "." + scene.getDescription()
                    + " The game is over. Press \"Enter\" to exit the game.";
            return endMsg;
        }
    }

    @Override
    public boolean doAction(String inputs) {
        return false;
    }

}
