package playxo;

public class Player {
    private final String name;
    private final Figure fig;

    public Player(String name, Figure fig) {
        this.name = name;
        this.fig = fig;
    }

    public Figure getFig() {
        return fig;
    }
    
    public String getName() {
        return name;
    }
}
