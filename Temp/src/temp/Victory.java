package temp;

public class Victory {
    public boolean status() {
        boolean boo = false;
        String[][] ar = {{"X","X","X"},
                         {" ","O","O"},
                         {" "," "," "}};
        if(ar[0][0]=="X" && ar[0][1]=="X" && ar[0][2]=="X") boo = true;
        
        return boo;
    }
}
