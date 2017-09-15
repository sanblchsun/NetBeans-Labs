package temp;

public class Radio implements Electrucity{
    
    public void radioOn() {
        System.out.println("Радио включен");
    }

    @Override
    public void electrucityOn() {
        radioOn();
    }
    
    
}
