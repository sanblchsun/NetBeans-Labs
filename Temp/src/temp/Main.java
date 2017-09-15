package temp;

public class Main {
    public static void main(String[] args) {
        Swich sw = new Swich();
        Lamp lp = new Lamp();
        Radio ra = new Radio();
        sw.els.add(lp);
        sw.els.add(ra);
        sw.swichOn();
    }
}
