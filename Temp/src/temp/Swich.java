package temp;

import java.util.ArrayList;
import java.util.List;

public class Swich {
    public List<Electrucity> els = new ArrayList<>();
    
    public void swichOn() {
        System.out.println("Выключатель включен");
        for(Electrucity el:els) if(el!=null) el.electrucityOn();
    }   
    
}
