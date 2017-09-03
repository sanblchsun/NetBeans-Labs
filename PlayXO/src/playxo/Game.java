package playxo;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    
    private static int coordinateX;
    private static int coordinateY;   
    
    public static void gameStep(Player players) {       
        while (true) {            
            coordinateX = scannerXY("Введите координату х: ");
            coordinateY = scannerXY("Введите координату у: ");    
            if(" ".equals(Board.boardXO[coordinateX-1][coordinateY-1])) {
                Board.boardXO[coordinateX-1][coordinateY-1] = players.getFig().toString();
                break;
            } else {
                    System.out.println("Поле занято");
                }
            }            
        }


    private static int scannerXY(String str) {
        int coordinate;
        System.out.println(str);
        while (true) {  
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()) {
                coordinate = sc.nextInt();
                if(coordinate<4 && coordinate>0) break; else System.out.println("Введите число от 1 до 3");
            }else System.out.println("Вы ввели не верное значение координаты, повторите"); 
        } 
        return coordinate;
    }
}
