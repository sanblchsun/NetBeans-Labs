package playxo;

public class Victory {
    public static boolean status(String fig) {
        boolean resalt = false;
        if(Board.boardXO[0][0]==fig && Board.boardXO[0][1]==fig && Board.boardXO[0][2]==fig) return true;
        else if(Board.boardXO[1][0]==fig && Board.boardXO[1][1]==fig && Board.boardXO[1][2]==fig) return true;
        else if(Board.boardXO[2][0]==fig && Board.boardXO[2][1]==fig && Board.boardXO[2][2]==fig) return true;
        
        else if(Board.boardXO[0][0]==fig && Board.boardXO[1][0]==fig && Board.boardXO[2][0]==fig) return true;
        else if(Board.boardXO[0][1]==fig && Board.boardXO[1][1]==fig && Board.boardXO[2][1]==fig) return true;
        else if(Board.boardXO[0][2]==fig && Board.boardXO[1][2]==fig && Board.boardXO[2][2]==fig) return true;
        
        else if(Board.boardXO[0][0]==fig && Board.boardXO[1][1]==fig && Board.boardXO[2][2]==fig) return true;
        else if(Board.boardXO[2][0]==fig && Board.boardXO[1][1]==fig && Board.boardXO[0][2]==fig) return true;
        return resalt;
    }
}
