
package playxo;

import java.util.Scanner;

public class Main {
      
    public static void main(String[] arg) {
        
        Player[] players = {new Player("Sasha", Figure.X),
                                new Player("Olia", Figure.O)};
        int turnSwitch = 0;
        
        while (true) {  
            System.out.println("Играет: " + players[turnSwitch].getName()); 
            Game.gameStep(players[turnSwitch]);
            View.viewBoard();
            if(Victory.status(players[turnSwitch].getFig().toString())) break;
            if(turnSwitch==0)turnSwitch=1;else turnSwitch=0;
        }
        
        System.out.println("Выиграл!!!!!!!!!!!!!!!! " + players[turnSwitch].getName());
    }
 }
