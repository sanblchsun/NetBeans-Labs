package temp;

public class Main {
    public static void main(String[] args) {
        Swich sw = new Swich();
        Lamp lp = new Lamp();
        sw.el = lp;
        sw.swichOn();
    }
}
