
package playxo;

import java.util.Scanner;

public class Main {
      
    public static void main(String[] arg) {
        
        Player[] players = {new Player("Sasha", Figure.X),
                                new Player("Olia", Figure.O)};
        int turnSwitch = 0;
        View.viewBoard();
        while (true) {  
            System.out.println("Играет: " + players[turnSwitch].getName()); 
            Game.gameStep(players[turnSwitch]);
            View.viewBoard();
            if(turnSwitch==0) {
                if(Victory.status((t) -> t==players[0].getFig())) break;               
                turnSwitch=1;}
            else {
                if(Victory.status((t) -> t==players[1].getFig())) break;
                turnSwitch=0;}
        }       
        System.out.println("Выиграл!!!!!!!!!!!!!!!! " + players[turnSwitch].getName());
    }
 }
