package temp;

import java.util.function.Predicate;

public class Temp {

    public static boolean victory(Figure[][] figure, Predicate<Figure> pre) {
        for(int i=0;i<figure.length;++i){
            if(pre.test(figure[i][0]) && pre.test(figure[i][1]) && pre.test(figure[i][2])) {System.out.println(i + "" + 0); return true;}    
            else if(pre.test(figure[0][i]) && pre.test(figure[1][i]) && pre.test(figure[2][i])) {System.out.println(0 + "" + i); return true;}
        }  
        if(pre.test(figure[1][1]) && (pre.test(figure[0][0]) && pre.test(figure[2][2]) || 
                (pre.test(figure[0][2]) && pre.test(figure[2][0])))) {System.out.println("Крест"); return true;}
        return false;
    }
    
   public static void main(String[] args) {
       Figure[][] figure = {{Figure.O,null,Figure.X},
                            {Figure.O,Figure.X,Figure.X},
                            {Figure.O,null,Figure.X}}; 
       
       System.out.println(victory(figure, (x)->x==Figure.X));
  }
}