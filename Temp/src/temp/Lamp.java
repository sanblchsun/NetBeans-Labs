package temp;

public class Lamp implements Electrucity{
    
    public void lampPower() {
        System.out.println("Лампа вкдючена");
    }

    @Override
    public void electrucityOn() {
        lampPower();
    }
}
