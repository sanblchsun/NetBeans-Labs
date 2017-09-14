package temp;

public class Swich {
    public Electrucity el;
    public void swichOn() {
        System.out.println("Выключатель включен");
        if(el!=null) el.electrucityOn();
    }
    
}
