package temp;

public class Main {
    public static void main(String[] args) {
        Swich sw = new Swich();
        sw.addLS(new Lamp());
        sw.addLS(new Radio());
        sw.swichOn();
    }
    
}
