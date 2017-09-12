package temp;

public class Temp {

    public static void main(String[] args) {
        Box b1 = new Box(1,3);
        Box b2 = new Box(3,4);
        Box3D b3d = new Box3D(2, 1, 2);
        System.out.println(max2(b1,b3d));
        
    }

   
    private static <T extends Comparable<? super T>> T max2(T b1, T b2) {
        T max2 = b1;
        if(b2.compareTo(b1)>0) max2 = b2;
        return max2;
    }
    
}
