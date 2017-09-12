package temp;

public class Box implements Comparable<Box>{
    int a;
    int b;

    public Box(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }

    @Override
    public int compareTo(Box box) {
        return a*b - box.a*box.b;
    }
    
}
