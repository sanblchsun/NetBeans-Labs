package temp;

public class Box3D extends Box{
    int c;

    public Box3D(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c;
    }

    @Override
    public int compareTo(Box box) {
        return a*b*c-box.a*box.b;
    }

    

   
    
}
